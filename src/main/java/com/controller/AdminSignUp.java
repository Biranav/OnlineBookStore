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
import javax.servlet.http.HttpSession;

import com.dto.Admin;
import com.dao.*;

@WebServlet("/adminsignup")
public class AdminSignUp extends HttpServlet {
	String adminName;
	String eMail;
	String adminPass;
	String confmPass;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		adminName = req.getParameter("adminName");
		 eMail= req.getParameter("adminemail");
		 
		 adminPass= req.getParameter("newpwd");
		confmPass = req.getParameter("adminpwd");
		Admin admin= new Admin(adminName,adminPass,eMail);
		AdminDAO adDao= new AdminDAO();
	if(adminPass.equals(confmPass))	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into Admin values(?,?,?,?,?)");
			ps.setInt(1, admin.getId());
			ps.setString(2, admin.getAdminName());
			ps.setString(3, admin.getAdminPass());
			ps.setString(4, admin.getEmail());
			int count = ps.executeUpdate();
			con.close();
			adDao.saveAdmin(admin);
			HttpSession session = req.getSession();
			session.setAttribute("admin", admin);
			resp.sendRedirect("AdminLogin.html");
			
		} catch (Exception e) {
			System.out.println("Enter valid details..");
		} 
	}
		
	}
}
