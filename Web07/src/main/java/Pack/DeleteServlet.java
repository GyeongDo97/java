package Pack;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")// "/"�� �Է��ϸ� /index.html ���� ���� Ȯ���Ҽ��ִ�.
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public DeleteServlet() {
        super();
        System.out.println("������ ��");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String a = id;
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");			
		out.println("</head>");
		out.println("<body>");
			out.println("<tr>");
			out.println("<th>" + id + "���� �����Ǿ����ϴ�.</th><br/>");
			out.println("<th><a href = 'list?a="+a+"'>Ȯ��</a></th>");			
			out.println("</tr>");
		out.println("</body>");			
		out.println("</html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
