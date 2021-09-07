package Pack;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿 프로그램 - 클라이언트 요청에 대하여 자바코드로 응답하는거
//servlet으로 짤려고하니 코드가 지저분해짐 이후 깔끔하게 짜기위해 나온게 JSP

@WebServlet("/hello")
//1. @WebServlet("/HelloServlet") 이였는데 위로 수정(소문자로 하고 뒤에 Servlet지우기)
public class HelloServlet extends HttpServlet {
	//2. Class 이름 변경 
	private static final long serialVersionUID = 1L;
    
	//3. 생성자 이름 변경
    public HelloServlet() {
        super();
        System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		//한글 사용하기위한 코드
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();

		out.println(
			"<html>" +
				"<body>" +
					"<h1>호랑이</h1>" +
				"</body>" +
			"</html>" 
		);
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
