package com.EvryIndia.domain;

public class User {
	private String patientId;
	private String patientName;
	private String age;
	private String bloodGroup;
	private String checkUp;
	private String doctors;
	private String testRecommended;
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getCheckUp() {
		return checkUp;
	}
	public void setCheckUp(String checkUp) {
		this.checkUp = checkUp;
	}
	public String getDoctors() {
		return doctors;
	}
	public void setDoctors(String doctors) {
		this.doctors = doctors;
	}
	public String getTestRecommended() {
		return testRecommended;
	}
	public void setTestRecommended(String testRecommended) {
		this.testRecommended = testRecommended;
	}
	
}
