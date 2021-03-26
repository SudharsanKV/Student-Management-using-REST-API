package com.sms.StudentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

//@WebServlet("/student/*")
public class StudentServlet extends HttpServlet {

	StudentList list = new StudentList();
	private Gson gson = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		gson = new Gson();
		BufferedReader br= new BufferedReader(new InputStreamReader(request.getInputStream()));
		String json="";
		if(br!=null) {
			json = br.readLine();
			System.out.println(json);
		}
		Student student= gson.fromJson(json, Student.class);
		list.create(student);

		response.setContentType("application/json");
		String studentString = gson.toJson(student);
		
		System.out.println(studentString);
		
		PrintWriter out = response.getWriter();
		response.setCharacterEncoding("UTF-8");
		out.print(studentString);
		out.flush();
	
		
//		doGet(request, response);
	}

}
