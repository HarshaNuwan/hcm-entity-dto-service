package edu.bit.hcm.wrapper;

import java.util.List;

import edu.bit.hcm.SpecializationDTO;

public class SpecializationDTOListWrapper {

	private List<SpecializationDTO> specializationList;
	private String URL;
	
	public SpecializationDTOListWrapper() {
		// TODO Auto-generated constructor stub
	}
	
	public SpecializationDTOListWrapper(List<SpecializationDTO> lst) {
		this.specializationList = lst;
	}
	
	public void setSpecializationLists(List<SpecializationDTO> list) {
		this.specializationList = list;
	}
	
	public List<SpecializationDTO> getSpecializationLists() {
		return specializationList;
	}
}
