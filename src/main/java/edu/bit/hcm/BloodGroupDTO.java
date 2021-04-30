package edu.bit.hcm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BloodGroupDTO {
	private int bloodGroupCode;

	private String bloodGroupName;

	public BloodGroupDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getBloodGroupCode() {
		return bloodGroupCode;
	}

	public void setBloodGroupCode(int bloodGroupCode) {
		this.bloodGroupCode = bloodGroupCode;
	}

	public String getBloodGroupName() {
		return bloodGroupName;
	}

	public void setBloodGroupName(String bloodGroupName) {
		this.bloodGroupName = bloodGroupName;
	}

}
