package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.*;
import com.dao.*;

@SuppressWarnings("serial")
@WebServlet("/addbookbyadmin")
public class AddBookByAdmin extends HttpServlet {
	
	String bookName;
	String bookId;
	String genre;
	String authorName;
	int rowCount ;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			bookName = req.getParameter("bookname");
			authorName =req.getParameter("authorName");
			genre=req.getParameter("genre");
			HttpSession session = req.getSession();
			Admin sessionAdmin = (Admin)session.getAttribute("admin");
			
			Book book = new Book(bookId,bookName,authorName,genre,sessionAdmin.getId());
			BookDAO bookDao=new BookDAO();
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore","root","root");
//			PreparedStatement ps = con.prepareStatement("insert into book values(?,?,?,?)");
//			ps.setString(1, book.getBookId());
//			ps.setString(2, book.getBookName());
//			ps.setString(3, book.getAuthorName());
//			ps.setString(4, book.getGenre());
//			con.close();
			bookDao.saveBook(book);
			resp.sendRedirect("/AddBookByAdmin");
		} catch (Exception e) {
			
			System.out.println("Give valid input!..");
		}
		
		
	}	
}
