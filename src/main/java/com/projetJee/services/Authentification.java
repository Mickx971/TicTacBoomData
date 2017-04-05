package com.projetJee.services;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Authentification extends HttpServlet {
	 private String paramLogin;
	    private String paramPassword;
	     
	    public void init() throws ServletException {
	        this.paramLogin = "zero";
	        this.paramPassword = "zoro";
	    }
	    private static final long serialVersionUID = 1L;
	        
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    
	 
	    /**
	     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	     */
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // TODO Auto-generated method stub
	         
	    }
	 
	    /**
	     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	     */
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // TODO Auto-generated method stub
	        String login = request.getParameter("login");
	        String pwd = request.getParameter("pwd");
	         
	        RequestDispatcher dispatcher = null;
	         
	         
	        if(this.paramLogin.equalsIgnoreCase(login) && this.paramPassword.equalsIgnoreCase(pwd)){
	            dispatcher = request.getRequestDispatcher("/accueil.jsp");
	        }else{
	            dispatcher = request.getRequestDispatcher("/login.jsp");
	        }
	        dispatcher.forward(request, response);
	        }
	         

}
