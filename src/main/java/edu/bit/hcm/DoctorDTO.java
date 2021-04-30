package edu.bit.hcm;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DoctorDTO {

	private int doctorId;

	private String addressL1;

	private String addressL2;

	private String addressL3;

	private Date dob;

	private String email;

	private String firstName;

	private String lastName;

	private String mobile;

	private String nic;

	private String regNo;

	private int specializationCode;

	private String telephone;

	private SpecializationDTO specializationDTO;

	public DoctorDTO() {
		// TODO Auto-generated constructor stub
	}
	

	public DoctorDTO(int doctorId, String addressL1, String addressL2, String addressL3, Date dob, String email,
			String firstName, String lastName, String mobile, String nic, String regNo, int specializationCode,
			String telephone, SpecializationDTO specializationDTO) {
		super();
		this.doctorId = doctorId;
		this.addressL1 = addressL1;
		this.addressL2 = addressL2;
		this.addressL3 = addressL3;
		this.dob = dob;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.nic = nic;
		this.regNo = regNo;
		this.specializationCode = specializationCode;
		this.telephone = telephone;
		this.specializationDTO = specializationDTO;
	}



	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getAddressL1() {
		return addressL1;
	}

	public void setAddressL1(String addressL1) {
		this.addressL1 = addressL1;
	}

	public String getAddressL2() {
		return addressL2;
	}

	public void setAddressL2(String addressL2) {
		this.addressL2 = addressL2;
	}

	public String getAddressL3() {
		return addressL3;
	}

	public void setAddressL3(String addressL3) {
		this.addressL3 = addressL3;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public int getSpecializationCode() {
		return specializationCode;
	}

	public void setSpecializationCode(int specializationCode) {
		this.specializationCode = specializationCode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public SpecializationDTO getSpecializationDTO() {
		return specializationDTO;
	}

	public void setSpecializationDTO(SpecializationDTO specializationDTO) {
		this.specializationDTO = specializationDTO;
	}

}
