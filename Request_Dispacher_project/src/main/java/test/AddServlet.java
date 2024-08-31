package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/ad")
public class AddServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	     PrintWriter pw=res.getWriter();
	     res.setContentType("text/html");
	     int a=Integer.parseInt(req.getParameter("v1"));
	     int b=Integer.parseInt(req.getParameter("v2"));
	      int c=a+b;
	      pw.print("<html><head><body bgcolor=red text=yellow><center>");
		  pw.print("Add :"+c+"<br>");
		  pw.print("</center></body></head></html>");
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
	}

}
