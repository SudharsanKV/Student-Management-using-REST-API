package com.sms.StudentManagement;

import java.io.IOException;
import com.sms.StudentManagement.Student;
import java.util.ArrayList;
import java.util.List;


public class StudentList {
	
	private static ArrayList<Student> students = new ArrayList<Student>();
	
	public StudentList() {
			
	}
	
	public static List<Student> getStudents(){return students;}

	public static void setStudents(ArrayList<Student> students) {StudentList.students = students;}
	
	public void create(Student student) {
//		System.out.println("create called");
		int id = students.size() + 1;
		
		System.out.println(id);
		
		student.setId(id);
		students.add(student);
	}
	
	public void updateStudent(Student s, int id) {
		for (Student student : students) {
			if(student.getId() == id) {
				student.setName(s.getName());
				student.setGender(s.getGender());
				student.setDepartment(s.getDepartment());
				student.setEmailid(s.getEmailid());
				student.setFname(s.getFname());
				student.setFmobile(s.getFmobile());
				student.setMname(s.getMname());
				student.setMmobile(s.getMmobile());
				student.setAddress(s.getAddress());
				student.setSem1(s.getSem1());
				student.setSem2(s.getSem2());
				student.setSem3(s.getSem3());
				student.setSem4(s.getSem4());
				student.setSem5(s.getSem5());
				student.setSem6(s.getSem6());
				student.setSem7(s.getSem7());
				student.setSem8(s.getSem8());
				System.out.println(student);
			}
		}
		
	}
	
	public Student getStudent(int id) {
		for (Student student : students) {
			if(student.getId() == id)
				return student;
		}
		return null;
	}
	
	
	
	
}
