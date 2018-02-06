package mypack;
import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class EntryServlet extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		String uname=request.getParameter("username");
		HttpSession session=request.getSession();
		session.setAttribute("username", uname);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h3>Welcome,"+uname+"</h3>");
		out.println("<a href=ExitServlet>Exit</a>");
		out.close();
	}
}
