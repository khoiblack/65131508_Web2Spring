import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ans1 = request.getParameter("q1");
		String ans2 = request.getParameter("q2");
		String ans3 = request.getParameter("q3");
		
		int score = 0;
		int totalQuestions = 3;

		
		if ("B".equals(ans1)) score++;
		if ("C".equals(ans2)) score++;
		if ("A".equals(ans3)) score++;
		
		
		String feedback = "";
		if (score == 3) {
			feedback = "Xuất sắc! Bạn nắm kiến thức rất vững.";
		} else if (score == 2) {
			feedback = "Khá tốt! Hãy ôn tập thêm một chút nhé.";
		} else {
			feedback = "Bạn cần xem lại tài liệu bài giảng rồi!";
		}
		
		
		request.setAttribute("diemSo", score);
		request.setAttribute("tongSoCau", totalQuestions);
		request.setAttribute("nhanXet", feedback);
		
		
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}
}