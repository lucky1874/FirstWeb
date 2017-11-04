package com.guoyasoft;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetHttp extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String  login = req.getParameter("login");
		String  password = req.getParameter("password");
		
		
		System.out.println("login:"+login+","+"password:"+password);
		resp.getWriter().write("get succes");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String  login = req.getParameter("login");
		String  password = req.getParameter("password");
		
		
		System.out.println("login:"+login+","+"password:"+password);
		resp.getWriter().write("post success");
	}

}
