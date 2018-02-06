package mypack;
import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class ExitServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{

		HttpSession session=request.getSession();
		String uname=(String) session.getAttribute("username");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h3>Logged out successfully,"+uname+"</h3>");
		session.invalidate();
		out.close();
	}
}
