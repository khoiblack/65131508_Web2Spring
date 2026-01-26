import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AboutMe")
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html lang='vi'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Profile - Cái Trần Đăng Khôi</title>");
		
		
		out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() + "/Style.css'>");
		
		out.println("</head>");
		out.println("<body>");

		
		out.println("<div class='card'>");
		
		
		out.println("  <div class='img-container'>");
		out.println("    <img src='images/avatar.jpg' alt='Avatar'>"); 
		out.println("  </div>");

		
		out.println("  <div class='content'>");
		out.println("    <h2>Cái Trần Đăng Khôi</h2>");
		out.println("    <div class='subtitle'>Web Developer</div>");
		
		out.println("    <div class='info-row'>");
		out.println("      <span class='label'>MSSV:</span>");
		out.println("      <span>65131508</span>");
		out.println("    </div>");
		
		out.println("    <div class='info-row'>");
		out.println("      <span class='label'>Lớp:</span>");
		out.println("      <span>65.CNTT-2</span>");
		out.println("    </div>");
		
		out.println("    <div class='info-row'>");
		out.println("      <span class='label'>Trường:</span>");
		out.println("      <span>Đại học Nha Trang</span>");
		out.println("    </div>");
		
		out.println("    <div class='info-row'>");
		out.println("      <span class='label'>Đam mê:</span>");
		out.println("      <span>Java, Android, Web App</span>");
		out.println("    </div>");

		out.println("  </div>"); 
		out.println("</div>"); 

		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}