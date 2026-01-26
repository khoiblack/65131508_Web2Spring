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
		
		
		out.println("<link href='https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap' rel='stylesheet'>");

		out.println("<style>");
		out.println("body {");
		out.println("  margin: 0;");
		out.println("  height: 100vh;");
		out.println("  display: flex;");
		out.println("  justify-content: center;");
		out.println("  align-items: center;");
		out.println("  background: linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%);"); 
		out.println("  font-family: 'Roboto', sans-serif;");
		out.println("}");

		out.println(".card {");
		out.println("  background: #ffffff;");
		out.println("  width: 700px;"); 
		out.println("  display: flex;"); 
		out.println("  border-radius: 20px;");
		out.println("  box-shadow: 0 15px 35px rgba(0,0,0,0.1);"); 
		out.println("  overflow: hidden;");
		out.println("  transition: transform 0.3s ease;");
		out.println("}");
		
		
		out.println(".card:hover { transform: translateY(-5px); }");

		
		out.println(".img-container {");
		out.println("  width: 40%;");
		out.println("  background-color: #333;");
		out.println("  position: relative;");
		out.println("}");

		out.println(".img-container img {");
		out.println("  width: 100%;");
		out.println("  height: 100%;");
		out.println("  object-fit: cover;"); 
		out.println("  display: block;");
		out.println("}");

		
		out.println(".content {");
		out.println("  width: 60%;");
		out.println("  padding: 40px;");
		out.println("  display: flex;");
		out.println("  flex-direction: column;");
		out.println("  justify-content: center;");
		out.println("}");

		out.println("h2 {");
		out.println("  margin: 0 0 5px 0;");
		out.println("  color: #2d3436;");
		out.println("  font-size: 28px;");
		out.println("  font-weight: 700;");
		out.println("}");

		out.println(".subtitle {");
		out.println("  color: #636e72;");
		out.println("  font-size: 16px;");
		out.println("  margin-bottom: 25px;");
		out.println("  font-weight: 500;");
		out.println("  text-transform: uppercase;");
		out.println("  letter-spacing: 1px;");
		out.println("}");

		out.println(".info-row {");
		out.println("  margin-bottom: 15px;");
		out.println("  font-size: 16px;");
		out.println("  color: #555;");
		out.println("  display: flex;");
		out.println("}");

		out.println(".label {");
		out.println("  font-weight: 600;");
		out.println("  color: #2d3436;");
		out.println("  width: 100px;"); 
		out.println("}");
		
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");

		out.println("<div class='card'>");
		
		
		out.println("  <div class='img-container'>");
		
		out.println("    <img src='images/avatar.jpg' alt='Ảnh đại diện'>"); 
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
		out.println("      <span>65.CNTT-CLC</span>"); 
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