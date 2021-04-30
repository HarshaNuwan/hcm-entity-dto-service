package edu.bit.hcm.wrapper;

import java.util.List;

import edu.bit.hcm.ChannelingDTO;

public class ChannelingDTOWrapper {

	private List<ChannelingDTO> list;

	public ChannelingDTOWrapper() {
		// TODO Auto-generated constructor stub
	}

	public ChannelingDTOWrapper(List<ChannelingDTO> list) {
		this.list = list;
	}

	public void setList(List<ChannelingDTO> list) {
		this.list = list;
	}

	public List<ChannelingDTO> getList() {
		return list;
	}

}
