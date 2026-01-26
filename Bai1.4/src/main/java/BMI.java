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

    public BMI() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Tính chỉ số BMI</title>");
		
		out.println("<style>");
		out.println("body { font-family: 'Segoe UI', sans-serif; background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%); height: 100vh; display: flex; justify-content: center; align-items: center; margin: 0; }");
		out.println(".container { background: white; padding: 40px; border-radius: 15px; box-shadow: 0 10px 25px rgba(0,0,0,0.2); width: 350px; text-align: center; }");
		out.println("h2 { color: #2c3e50; margin-bottom: 30px; }");
		out.println("input[type='text'], input[type='number'] { width: 100%; padding: 12px; margin: 10px 0; border: 1px solid #ddd; border-radius: 5px; box-sizing: border-box; outline: none; transition: 0.3s; }");
		out.println("input[type='text']:focus, input[type='number']:focus { border-color: #84fab0; box-shadow: 0 0 5px rgba(132, 250, 176, 0.5); }");
		out.println("input[type='submit'] { background-color: #2ecc71; color: white; border: none; padding: 12px 20px; border-radius: 5px; cursor: pointer; font-size: 16px; width: 100%; margin-top: 20px; font-weight: bold; transition: background 0.3s; }");
		out.println("input[type='submit']:hover { background-color: #27ae60; }");
		out.println("label { font-weight: bold; color: #555; display: block; text-align: left; margin-top: 10px; }");
		out.println("</style>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<div class='container'>");
		out.println("<h2>Tính Toán BMI</h2>");
		
		
		out.println("<form action='BMI' method='POST'>");
		
		out.println("<label>Chiều cao (m):</label>");
		
		out.println("<input type='number' step='0.01' name='height' placeholder='Ví dụ: 1.75' required>");
		
		out.println("<label>Cân nặng (kg):</label>");
		out.println("<input type='number' step='0.1' name='weight' placeholder='Ví dụ: 65' required>");
		
		out.println("<input type='submit' value='TÍNH BMI'>");
		out.println("</form>");
		
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
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
				phanLoai = "Gầy";
				advice = "Bạn nên ăn uống đầy đủ chất dinh dưỡng hơn.";
				color = "#f39c12"; 
			} else if (bmi < 22.9) {
				phanLoai = "Bình thường";
				advice = "Tuyệt vời! Hãy duy trì chế độ sinh hoạt này.";
				color = "#27ae60"; 
			} else if (bmi < 24.9) {
				phanLoai = "Thừa cân";
				advice = "Bạn nên tập thể dục nhẹ nhàng.";
				color = "#e67e22"; 
			} else if (bmi < 29.9) {
				phanLoai = "Béo phì độ I";
				advice = "Cần chế độ ăn kiêng và tập luyện.";
				color = "#e74c3c"; 
			} else {
				phanLoai = "Béo phì độ II";
				advice = "Cảnh báo! Cần gặp bác sĩ tư vấn.";
				color = "#c0392b"; 
			}
			
		} catch (Exception e) {
			out.println("<h3>Có lỗi xảy ra! Vui lòng nhập đúng định dạng số.</h3>");
			return;
		}

		
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Kết quả BMI</title>");
		out.println("<style>");
		out.println("body { font-family: 'Segoe UI'; background: #f0f2f5; height: 100vh; display: flex; justify-content: center; align-items: center; margin: 0; }");
		out.println(".result-card { background: white; padding: 40px; border-radius: 15px; box-shadow: 0 10px 25px rgba(0,0,0,0.1); width: 400px; text-align: center; }");
		out.println(".bmi-number { font-size: 50px; font-weight: bold; color: " + color + "; margin: 20px 0; }");
		out.println(".status { font-size: 24px; font-weight: bold; color: " + color + "; text-transform: uppercase; margin-bottom: 10px; }");
		out.println(".btn-back { display: inline-block; margin-top: 30px; text-decoration: none; background: #3498db; color: white; padding: 10px 20px; border-radius: 5px; }");
		out.println("</style></head>");
		
		out.println("<body>");
		out.println("<div class='result-card'>");
		out.println("<h2>KẾT QUẢ CỦA BẠN</h2>");
		out.println("<div>Chỉ số BMI:</div>");
		
		
		out.println("<div class='bmi-number'>" + String.format("%.2f", bmi) + "</div>");
		
		out.println("<div class='status'>" + phanLoai + "</div>");
		out.println("<p>" + advice + "</p>");
		
		
		out.println("<a href='BMI' class='btn-back'>Tính lại</a>");
		
		out.println("</div>");
		out.println("</body></html>");
	}
}