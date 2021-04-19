package com.sms.StudentManagement;

import java.util.List;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.GET;
//import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("getstudents")
public class StudentResource 
{
	
	private StudentList list = new StudentList();
	@GET
	@Path("students")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Student> getStudents() {
//		System.out.println("students");
//		return Response
//		      .status(200)
//		      .header("Access-Control-Allow-Origin", "http://localhost:8123")
//		      .header("Access-Control-Allow-Credentials", "true")
//		      .header("Access-Control-Allow-Headers",
//		        "origin, content-type, accept, authorization")
//		      .header("Access-Control-Allow-Methods", 
//		        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
//		      .entity(list.getStudents())
//		      .build();
		return list.getStudents();
	}
	
	@GET
	@Path("students/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("id") int id) {
		return list.getStudent(id);
//		return Response
//		      .status(200)
//		      .header("Access-Control-Allow-Origin", "http://localhost:8123")
//		      .header("Access-Control-Allow-Credentials", "true")
//		      .header("Access-Control-Allow-Headers",
//		        "origin, content-type, accept, authorization")
//		      .header("Access-Control-Allow-Methods", 
//		        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
//		      .entity(list.getStudent(id))
//		      .build();
	}
	
	@PUT
	@Path("students/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void updateStudent(Student sample, @PathParam("id") int id) {
//		return list.getStudent(id);
		Student s1 = list.getStudent(id);
		list.updateStudent(sample, id);
	}
	
	@POST
	@Path("students")
	@Produces(MediaType.APPLICATION_JSON)
	public void createStudent(Student s1) {
		
		System.out.println(list.getStudents().size());
		
		s1.setId(list.getStudents().size());
		
		System.out.println(s1);
		list.create(s1);
//		return s1;
//		return Response
//		      .status(200)
//		      .header("Access-Control-Allow-Origin", "http://localhost:8123")
//		      .header("Accept", "application/json")
//		      .header("Access-Control-Allow-Credentials", "true")
//		      .header("Access-Control-Allow-Headers",
//		        "origin, content-type, accept, authorization")
//		      .header("Access-Control-Allow-Methods", 
//		        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
//		      .entity(s1)
//		      .build();
	}
}
