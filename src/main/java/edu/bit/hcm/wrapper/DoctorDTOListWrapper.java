package edu.bit.hcm.wrapper;

import java.util.List;

import edu.bit.hcm.DoctorDTO;

public class DoctorDTOListWrapper {
	private List<DoctorDTO> doctors;
	
	public DoctorDTOListWrapper() {
		// TODO Auto-generated constructor stub
	} 
	
	public DoctorDTOListWrapper(List<DoctorDTO> lst) {
		this.doctors = lst;
	}
	
	public void setDoctors(List<DoctorDTO> doctors) {
		this.doctors = doctors;
	}
	
	public List<DoctorDTO> getDoctors() {
		return doctors;
	}
}
