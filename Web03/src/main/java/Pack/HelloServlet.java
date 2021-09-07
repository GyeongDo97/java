package Pack;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//���� ���α׷� - Ŭ���̾�Ʈ ��û�� ���Ͽ� �ڹ��ڵ�� �����ϴ°�
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
        super();
        System.out.println("������ ��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		//servlet���� ©�����ϴ� �ڵ尡 ���������� ���� ����ϰ� ¥������ ���°� JSP
		PrintWriter out = response.getWriter();

		//out.println("�±� ���");
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
