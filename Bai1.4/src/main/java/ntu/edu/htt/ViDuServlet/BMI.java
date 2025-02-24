package ntu.edu.htt.ViDuServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BMI
 */
@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Tính BMI</title></head><body>");
        out.println("<h2>Nhập thông tin để tính BMI</h2>");
        out.println("<form method='POST' action='BMI'>");
        out.println("Chiều cao (m): <input type='text' name='height'><br>");
        out.println("Cân nặng (kg): <input type='text' name='weight'><br>");
        out.println("<input type='submit' value='Tính BMI'>");
        out.println("</form>");
        out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();
        try {
            double height = Double.parseDouble(request.getParameter("height"));
            double weight = Double.parseDouble(request.getParameter("weight"));
            double bmi = weight / (height * height);

            out.println("<html><head><title>Kết quả BMI</title></head><body>");
            out.println("<h2>Kết quả BMI của bạn</h2>");
            out.println("Chiều cao: " + height + " m<br>");
            out.println("Cân nặng: " + weight + " kg<br>");
            out.println("Chỉ số BMI: " + String.format("%.2f", bmi) + "<br>");

            String category;
            if (bmi < 18.5) {
                category = "Gầy";
            } else if (bmi < 24.9) {
                category = "Bình thường";
            } else if (bmi < 29.9) {
                category = "Thừa cân";
            } else {
                category = "Béo phì";
            }
            out.println("Phân loại: " + category);

            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><head><title>Lỗi</title></head><body>");
            out.println("<h2>Lỗi: Vui lòng nhập số hợp lệ cho chiều cao và cân nặng!</h2>");
            out.println("</body></html>");
        }
	}

}
