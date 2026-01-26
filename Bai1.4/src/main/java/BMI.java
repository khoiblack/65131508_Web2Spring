import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BMI() { super(); }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/formBMI.html").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String heightStr = request.getParameter("height");
		String weightStr = request.getParameter("weight");
		
		double bmi = 0;
		String phanLoai = "";
		String advice = "";
		String color = "#333";
		
		try {
			double height = Double.parseDouble(heightStr);
			double weight = Double.parseDouble(weightStr);
			bmi = weight / (height * height);
			
			if (bmi < 18.5) {
				phanLoai = "Gầy"; advice = "Bạn nên ăn uống đầy đủ hơn."; color = "#f39c12";
			} else if (bmi < 22.9) {
				phanLoai = "Bình thường"; advice = "Tuyệt vời! Hãy duy trì nhé."; color = "#27ae60";
			} else if (bmi < 24.9) {
				phanLoai = "Thừa cân"; advice = "Nên tập thể dục nhẹ nhàng."; color = "#e67e22";
			} else {
				phanLoai = "Béo phì"; advice = "Cần gặp bác sĩ tư vấn."; color = "#c0392b";
			}
		} catch (Exception e) {
			
		}

		
		out.println("<!DOCTYPE html><html><head><title>Kết quả BMI</title>");
		
		
		out.println("<link rel='stylesheet' href='style.css'>"); 
		
		
		out.println("<style>.bmi-number, .status { color: " + color + "; }</style>");
		
		out.println("</head><body>");
		out.println("<div class='result-card'>");
		out.println("<h2>KẾT QUẢ CỦA BẠN</h2>");
		out.println("<div>Chỉ số BMI:</div>");
		out.println("<div class='bmi-number'>" + String.format("%.2f", bmi) + "</div>");
		out.println("<div class='status'>" + phanLoai + "</div>");
		out.println("<p>" + advice + "</p>");
		
		
		out.println("<a href='BMI' class='btn-back'>Tính lại</a>");
		
		out.println("</div></body></html>");
	}
}