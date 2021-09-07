package Pack;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")// "/"�� �Է��ϸ� /index.html ���� ���� Ȯ���Ҽ��ִ�.
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public IndexServlet() {
        super();
        System.out.println("������ ��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. ����Ÿ ���̽� ������ �ʿ��ϱ� ������ index.html���� �ڹ� �ڵ带 �̿��Ѵ�.
		// 2. ������ �ε��Ѵ�.
		// �� ������ ���������� ����ϸ� ������ ���α׷����̶�� �Ѵ�.
		// ������ ���α׷��� ���� Servlet�� ����Ѵ�.
		System.out.println("doGet");
		response.setContentType("text/html; charset=UTF-8");
		ServletContext context = getServletContext();
		RequestDispatcher dispatchar = context.getRequestDispatcher("/test.jsp");
		dispatchar.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
