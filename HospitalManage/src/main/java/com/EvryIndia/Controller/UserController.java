package com.EvryIndia.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.EvryIndia.dao.UserDao; 

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
		
		String patientId = request.getParameter("patientId");
        String patientName = request.getParameter("patientName");
        String age = request.getParameter("age"); 
        String bloodGroup = request.getParameter("bloodGroup");
        String checkUp = request.getParameter("checkUp");
        String doctors = request.getParameter("doctors");
        String testRecommended = request.getParameter("testRecommended");
 
        HttpSession session = request.getSession(true);
        try {
            UserDao userDAO = new UserDao();
            userDAO.addUserDetails(patientId,patientName,age,bloodGroup,checkUp,doctors,testRecommended);
            response.sendRedirect("Success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
        
        /*if(patientId.isEmpty() || patientName.isEmpty() || age.isEmpty() || bloodGroup.isEmpty() ){
			RequestDispatcher req = request.getRequestDispatcher("index.jsp");
			req.include(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("success.jsp");
			req.forward(request, response);
		}*/
 
    }
}
