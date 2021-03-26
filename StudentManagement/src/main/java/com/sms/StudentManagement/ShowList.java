package com.sms.StudentManagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowList
 */
@WebServlet("/list")
public class ShowList extends HttpServlet {
	
	StudentList list = new StudentList();
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException
	{
		List<Student> show = list.getStudents();
		PrintWriter out= response.getWriter();
		for (Student student : show) {
			out.print(student.getName());
		}
	}
}
