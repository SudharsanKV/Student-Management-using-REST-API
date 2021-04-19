package com.sms.StudentManagement;

public class Student {
	private int id;
	 private String name;
	 private String gender;
	 private String department;
	 private String emailid;
	 private String fname;
	 private String fmobile;
	 private String mname;
	 private String mmobile;
	 private String address;
	 private int sem1 = 0;
	 private int sem2 = 0;
	 private int sem3 = 0;
	 private int sem4 = 0;
	 private int sem5 = 0;
	 private int sem6 = 0;
	 private int sem7 = 0;
	 private int sem8 = 0;
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
	public int getSem1() {
		return sem1;
	}
	public void setSem1(int sem1) {
		this.sem1 = sem1;
	}
	public int getSem2() {
		return sem2;
	}
	public void setSem2(int sem2) {
		this.sem2 = sem2;
	}
	public int getSem3() {
		return sem3;
	}
	public void setSem3(int sem3) {
		this.sem3 = sem3;
	}
	public int getSem4() {
		return sem4;
	}
	public void setSem4(int sem4) {
		this.sem4 = sem4;
	}
	public int getSem5() {
		return sem5;
	}
	public void setSem5(int sem5) {
		this.sem5 = sem5;
	}
	public int getSem6() {
		return sem6;
	}
	public void setSem6(int sem6) {
		this.sem6 = sem6;
	}
	public int getSem7() {
		return sem7;
	}
	public void setSem7(int sem7) {
		this.sem7 = sem7;
	}
	public int getSem8() {
		return sem8;
	}
	public void setSem8(int sem8) {
		this.sem8 = sem8;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department
				+ ", emailid=" + emailid + ", fname=" + fname + ", fmobile=" + fmobile + ", mname=" + mname
				+ ", mmobile=" + mmobile + ", address=" + address + ", sem1=" + sem1 + ", sem2=" + sem2 + ", sem3="
				+ sem3 + ", sem4=" + sem4 + ", sem5=" + sem5 + ", sem6=" + sem6 + ", sem7=" + sem7 + ", sem8=" + sem8
				+ "]";
	}
	
	
}
