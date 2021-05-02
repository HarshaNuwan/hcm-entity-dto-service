package edu.bit.hcm.wrapper;

import java.util.List;

import edu.bit.hcm.PatientDTO;

public class PatientDTOListWrapper {
	private List<PatientDTO> list;

	public PatientDTOListWrapper() {
		// TODO Auto-generated constructor stub
	}

	public PatientDTOListWrapper(List<PatientDTO> list) {
		this.list = list;
	}

	public void setList(List<PatientDTO> list) {
		this.list = list;
	}

	public List<PatientDTO> getList() {
		return list;
	}
}
