package Pack;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//���� ���α׷� - Ŭ���̾�Ʈ ��û�� ���Ͽ� �ڹ��ڵ�� �����ϴ°�
//servlet���� ©�����ϴ� �ڵ尡 ���������� ���� ����ϰ� ¥������ ���°� JSP

@WebServlet("/hello")
//1. @WebServlet("/HelloServlet") �̿��µ� ���� ����(�ҹ��ڷ� �ϰ� �ڿ� Servlet�����)
public class HelloServlet extends HttpServlet {
	//2. Class �̸� ���� 
	private static final long serialVersionUID = 1L;
    
	//3. ������ �̸� ����
    public HelloServlet() {
        super();
        System.out.println("������ ��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		//�ѱ� ����ϱ����� �ڵ�
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();

		out.println(
			"<html>" +
				"<body>" +
					"<h1>ȣ����</h1>" +
				"</body>" +
			"</html>" 
		);
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
