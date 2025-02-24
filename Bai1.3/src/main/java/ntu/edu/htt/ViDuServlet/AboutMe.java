package ntu.edu.htt.ViDuServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AboutMe
 */
@WebServlet("/AboutMe")
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMe() {
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
        
        out.println("<html><head><title>About Me</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #fff; margin: 0; padding: 20px; }");
        out.println("h1 { color: #000; text-align: left; }");
        out.println("p { font-size: 18px; margin: 50px 0px 0px 50px; color: #000; text-align: left }");
        out.println("</style>");
        out.println("</head><body>");

        out.println("<h1>Thông tin cơ bản</h1>");
        out.println("<p><strong>Họ và tên:</strong> Hồ Tấn Tài</p>");
        out.println("<p><strong>Email:</strong> tai.ht.64cntt@ntu.edu.vn</p>");
        out.println("<p><strong>Số điện thoại:</strong> 0905783845</p>");
        out.println("<p><strong>Trường đang học:</strong> Đại học Nha Trang</p>");
        out.println("<p><strong>Chuyên ngành:</strong> Công nghệ thông tin</p>");
        out.println("<p><strong>MSSV:</strong> 64132072</p>");

        out.println("</body></html>");
	}

}
