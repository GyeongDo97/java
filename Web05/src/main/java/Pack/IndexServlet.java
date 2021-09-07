package Pack;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")// "/"를 입력하면 /index.html 보다 먼저 확인할수있다.
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public IndexServlet() {
        super();
        System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 데이타 베이스 접속이 필요하기 때문에 index.html말고 자바 코드를 이용한다.
		// 2. 정보를 로딩한다.
		// 위 두줄의 이유때문에 사용하며 동적인 프로그래밍이라고 한다.
		// 동적인 프로그램을 위해 Servlet을 사용한다.
		System.out.println("doGet");
		response.setContentType("text/html; charset=UTF-8");
		ServletContext context = getServletContext();
		RequestDispatcher dispatchar = context.getRequestDispatcher("/test.jsp");
		dispatchar.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
