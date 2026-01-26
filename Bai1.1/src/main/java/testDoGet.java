

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/testDoGet")
public class testDoGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value1 = request.getParameter("param1");
		String value2 = request.getParameter("param2");
		PrintWriter traVe = response.getWriter();
		traVe.append("Giá trị tham số param 1= ");
		traVe.append(value1);
		traVe.append("\nGiá trị tham số param 2= ");
		traVe.append(value2);
		
	}
	

	
	

}
