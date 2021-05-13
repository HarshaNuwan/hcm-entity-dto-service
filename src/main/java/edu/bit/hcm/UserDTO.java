package edu.bit.hcm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

	private int userId;
	private String username;
	private String password;
	private Long timeStamp;
	private boolean active;
	private Integer userRoleId;
	private Integer doctorId;

	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(int userId, String username, String password, Long timeStamp, boolean active, Integer userRoleId) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.timeStamp = timeStamp;
		this.active = active;
		this.userRoleId = userRoleId;
	}

	public UserDTO(int userId, String username, String password, Long timeStamp, boolean active, Integer userRoleId,
			Integer doctorId) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.timeStamp = timeStamp;
		this.active = active;
		this.userRoleId = userRoleId;
		this.doctorId = doctorId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

}
