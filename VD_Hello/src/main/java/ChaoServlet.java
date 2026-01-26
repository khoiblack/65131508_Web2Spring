

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ChaoServlet
 */
@WebServlet("/ChaoServlet")
public class ChaoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String noiDungHTML= "";
		noiDungHTML += "<center><h3> TÔI HỌC WEB JAVA </h3><center>";
		noiDungHTML += "<hr>";
		noiDungHTML += "65CNTT-CLC";
		
		PrintWriter boTraLoi = response.getWriter();
		boTraLoi.print(noiDungHTML);

	}
}
