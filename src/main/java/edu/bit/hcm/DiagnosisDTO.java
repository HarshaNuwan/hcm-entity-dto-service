package edu.bit.hcm;

import java.util.Date;

public class DiagnosisDTO {

	private int channelId;

	private Date date;

	private String diagnosis;

	private int diagnosisId;

	private int doctorId;

	private int pid;

	private String prescription;

	private String reports;

	private boolean prescriptionStatus;
	
	private boolean reportStatus;
	
	private PatientDTO patientDTO;
	
	public boolean isPrescriptionStatus() {
		return prescriptionStatus;
	}

	public void setPrescriptionStatus(boolean prescriptionStatus) {
		this.prescriptionStatus = prescriptionStatus;
	}

	public boolean isReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(boolean reportStatus) {
		this.reportStatus = reportStatus;
	}

	public DiagnosisDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getChannelId() {
		return channelId;
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

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public int getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(int diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public String getReports() {
		return reports;
	}

	public void setReports(String reports) {
		this.reports = reports;
	}
	
	public PatientDTO getPatientDTO() {
		return patientDTO;
	}
	
	public void setPatientDTO(PatientDTO patientDTO) {
		this.patientDTO = patientDTO;
	}

}
