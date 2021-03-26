package com.sms.StudentManagement;

public class Student {
	private int id=0;
	 private String name=null;
	 private String gender=null;
	 private String department=null;
	 private String emailid=null;
	 private String fname=null;
	 private String fmobile=null;
	 private String mname=null;
	 private String mmobile=null;
	 private String address=null;
//	public Student(String name, String gender, String department, String emailid, String fname, String fmobile, String mname,
//			String mmobile, String address) {
//		super();
//		this.name = name;
//		this.gender = gender;
//		this.department = department;
//		this.emailid = emailid;
//		this.fname = fname;
//		this.fmobile = fmobile;
//		this.mname = mname;
//		this.mmobile = mmobile;
//		this.address = address;
//	}
	 
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFmobile() {
		return fmobile;
	}
	public void setFmobile(String fmobile) {
		this.fmobile = fmobile;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMmobile() {
		return mmobile;
	}
	public void setMmobile(String mmobile) {
		this.mmobile = mmobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", department=" + department + ", emailid=" + emailid
				+ ", fname=" + fname + ", fmobile=" + fmobile + ", mname=" + mname + ", mmobile=" + mmobile
				+ ", address=" + address + "]";
	}
	
	
}
