package Pack;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")// "/"를 입력하면 /index.html 보다 먼저 확인할수있다.
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public UpdateServlet() {
        super();
        System.out.println("생성자 콜");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		System.out.println(id);
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");			
		out.println("</head>");
		out.println("<body>");
			out.println("<tr>");
			out.println("<th>" + id + "님이 수정되었습니다.</th>");
			out.println("</tr>");
		out.println("</body>");			
		out.println("</html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
