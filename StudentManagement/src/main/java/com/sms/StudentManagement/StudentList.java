package com.sms.StudentManagement;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Publisher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jakarta.servlet.http.HttpServlet;

public class StudentList extends HttpServlet {
	
	static ArrayList<Student> students = new ArrayList<Student>();

//	public void service (HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException,ServletException
//	{
//		HttpSession session = request.getSession();
//		session.setAttribute("list", students);
//		
//	}
	public Student getStudent(int id) {
		for (Student student : students) {
			if(student.getId() == id)
				return student;
		}
		return null;
	}
	public List<Student> getStudents(){
		return students;
	}
	public void create(Student s1) {
//		System.out.println("create called");
		students.add(s1);
	}
	public int size() {
		return students.size();
	}
}
