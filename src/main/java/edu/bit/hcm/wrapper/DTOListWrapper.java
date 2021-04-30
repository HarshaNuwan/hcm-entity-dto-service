package edu.bit.hcm.wrapper;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DTOListWrapper<T> {

	private List<T> dtoList;
	
	public DTOListWrapper() {
		// TODO Auto-generated constructor stub
	} 
	
	public DTOListWrapper(List<T> lst) {
		this.dtoList = lst;
	}
	
	public void setList(List<T> dtoList) {
		this.dtoList = dtoList;
	}
	
	public List<T> getList() {
		return dtoList;
	}
}
