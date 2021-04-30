package edu.bit.hcm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecializationDTO {

	private int specializationCode;

	private String specializationName;
	
	public SpecializationDTO() {
		// TODO Auto-generated constructor stub
	}

	public SpecializationDTO(int specializationCode, String specializationName) {
		super();
		this.specializationCode = specializationCode;
		this.specializationName = specializationName;
	}

	public int getSpecializationCode() {
		return specializationCode;
	}

	public void setSpecializationCode(int specializationCode) {
		this.specializationCode = specializationCode;
	}

	public String getSpecializationName() {
		return specializationName;
	}

	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}

}
