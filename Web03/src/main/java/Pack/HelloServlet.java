package Pack;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿 프로그램 - 클라이언트 요청에 대하여 자바코드로 응답하는거
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
        super();
        System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		//servlet으로 짤려고하니 코드가 지저분해짐 이후 깔끔하게 짜기위해 나온게 JSP
		PrintWriter out = response.getWriter();

		//out.println("태그 기록");
		out.println("<html>");
			out.println("<head>");			
			out.println("</head>");
			
			out.println("<body>");
				out.println("<h1> tiger100 </h1>");			
			out.println("</body>");			
		out.println("</html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
