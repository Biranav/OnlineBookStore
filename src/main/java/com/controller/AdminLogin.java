package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet{
	String username;
	String password;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		username = req.getParameter("adminName");
		password = req.getParameter("adminpwd");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore","root","root");
		PreparedStatement ps = con.prepareStatement("select username,userpass from admin ");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			if(username.equals(rs.getString(1))&&password.equals(rs.getString(2))) {
				req.getRequestDispatcher("BookDetails.html").forward(req, resp);
			}
			else {
				req.getRequestDispatcher("AdminLogin.html").forward(req, resp);
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
