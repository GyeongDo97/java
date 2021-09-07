package Pack;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/world")
//위의 줄을 생략하기위해 xml이용
public class WorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public WorldServlet() {
        super();
        System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");		
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
