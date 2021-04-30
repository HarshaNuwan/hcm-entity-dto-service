package edu.bit.hcm;

import java.util.Date;

public class ChannelingDTO {
	private int channelingId;

	private int appointmentNo;

	private Date date;

	private int doctorId;

	private int pid;

	private String reason;

	private String time;

	public ChannelingDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getChannelingId() {
		return channelingId;
	}

	public void setChannelingId(int channelingId) {
		this.channelingId = channelingId;
	}

	public int getAppointmentNo() {
		return appointmentNo;
	}

	public void setAppointmentNo(int appointmentNo) {
		this.appointmentNo = appointmentNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
