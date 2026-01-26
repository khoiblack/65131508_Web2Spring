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

    public AboutMe() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Cấu hình trả về định dạng HTML và hỗ trợ Tiếng Việt
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		// 2. Viết mã HTML và CSS (Để giao diện đẹp)
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Giới thiệu bản thân</title>");
		
		// Phần CSS để trang trí
		out.println("<style>");
		out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f0f2f5; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
		out.println(".card { background: white; padding: 40px; border-radius: 15px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); text-align: center; width: 350px; }");
		out.println(".avatar { width: 100px; height: 100px; background-color: #3498db; border-radius: 50%; margin: 0 auto 20px; line-height: 100px; color: white; font-size: 40px; font-weight: bold; }");
		out.println("h2 { color: #333; margin-bottom: 10px; }");
		out.println("p { color: #666; font-size: 16px; margin: 5px 0; }");
		out.println(".highlight { color: #e74c3c; font-weight: bold; }");
		out.println("</style>");
		
		out.println("</head>");
		out.println("<body>");
		
		// 3. Phần nội dung hiển thị (Thông tin của bạn)
		out.println("<div class='card'>");
		out.println("<div class='avatar'>K</div>"); // Chữ K đại diện cho tên Khôi
		out.println("<h2>Thông tin sinh viên</h2>");
		out.println("<p>Họ và tên: <span class='highlight'>Cái Trần Đăng Khôi</span></p>");
		out.println("<p>MSSV: <span class='highlight'>65131508</span></p>");
		out.println("<p>Lớp: Phát triển ứng dụng Web</p>");
		out.println("<p>Trường: Đại học Nha Trang</p>");
		out.println("</div>");
		
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}