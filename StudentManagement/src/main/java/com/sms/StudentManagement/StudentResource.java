package com.sms.StudentManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentResource 
{
		
	StudentList list = new StudentList();
//	static ArrayList<Student> st = new ArrayList<Student>();
	@GET
	@Path("getstudents")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents() {
//		 System.out.println("getStudents Called");
		return list.getStudents();
	}
	
	@GET
	@Path("student/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("id") int id) {
//		System.out.println(id);
//		for(Student student : st) {
//			if(student.getId() == id)
//				return student;
//		}
		return list.getStudent(id);
	}
	
	@POST
	@Path("addstudent")
	@Produces(MediaType.APPLICATION_JSON)
	public Student createStudent(Student s1) {
		//System.out.println("createStudent called");
//		System.out.println(s1);
//		st.add(s1);
		int id = list.size();
		s1.setId(id+1);
		list.create(s1);
//		System.out.println(s1.getId());
//		System.out.println(s1.getName());
//		System.out.println(s1.getGender());
//		System.out.println(s1.getDepartment());
//		System.out.println(s1.getEmailid());
//		System.out.println(s1.getFname());
//		System.out.println(s1.getFmobile());
//		System.out.println(s1.getMname());
//		System.out.println(s1.getMmobile());
//		System.out.println(s1.getAddress());
//		list.create(s1);
		return s1;
	}
}
