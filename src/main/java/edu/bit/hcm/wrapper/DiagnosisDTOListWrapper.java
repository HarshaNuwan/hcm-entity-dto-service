package edu.bit.hcm.wrapper;

import java.util.List;

import edu.bit.hcm.DiagnosisDTO;

public class DiagnosisDTOListWrapper {
	private List<DiagnosisDTO> list;

	public DiagnosisDTOListWrapper() {
		// TODO Auto-generated constructor stub
	}

	public DiagnosisDTOListWrapper(List<DiagnosisDTO> list) {
		this.list = list;
	}

	public void setList(List<DiagnosisDTO> list) {
		this.list = list;
	}

	public List<DiagnosisDTO> getList() {
		return list;
	}
}
