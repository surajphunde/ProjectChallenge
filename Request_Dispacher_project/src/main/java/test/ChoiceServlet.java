package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/choice")
public class ChoiceServlet implements Servlet {

	@Override
	public void destroy() {
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
		
	
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1=req.getParameter("s1");
		if(s1.equals("Add")){
			RequestDispatcher rd=req.getRequestDispatcher("ad");
		    rd.forward(req, res);	
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("sb");
			rd.forward(req, res);
		}
		
	}
     
}
