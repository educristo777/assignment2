package com.csis3275.model;

public class Student_wva_06 extends Person_wva_06 {
	
	private String rollName;
	private String bio;
	private String indeedUrl;
	private String githubUrl;
	
	
	public Student_wva_06() {}

	public Student_wva_06(String address, int age, String city, String name, String rollName, String bio, String indeedUrl, String githubUrl) {
		super(address, age, city, name);
		
		this.rollName = rollName;
		this.bio = bio;
		this.indeedUrl = indeedUrl;
		this.githubUrl = githubUrl;
		
	}


	public String getRollName() {
		return rollName;
	}


	public void setRollName(String rollName) {
		this.rollName = rollName;
	}


	public String getBio() {
		return bio;
	}


	public void setBio(String bio) {
		this.bio = bio;
	}


	public String getIndeedUrl() {
		return indeedUrl;
	}


	public void setIndeedUrl(String indeedUrl) {
		this.indeedUrl = indeedUrl;
	}


	public String getGithubUrl() {
		return githubUrl;
	}


	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}
	
	
	
	

}
