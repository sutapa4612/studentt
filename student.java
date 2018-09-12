package com;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.studentpro;
import service.studentservice;
@WebServlet("/studentpage")
public class student extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//resp.setContentType("text/html");
	String branch = req.getParameter("branch");
	System.out.println(branch);
	studentservice s = new studentservice();
	//PrintWriter pw = resp.getWriter();
	//pw.println(s.check(branch));
	List<studentpro>  newjsp = (s.check(branch));
	req.setAttribute("studentbranch",newjsp);
    RequestDispatcher dispatcher=req.getRequestDispatcher("/output.jsp");
    dispatcher.forward(req, resp);
}
}
