package Pack;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static LinkedList<String> mm = new LinkedList<String>(Arrays.asList("홍길동","유관순","김경도"));
       
    public ListServlet() {
        super();
        System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("doGet");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		PrintWriter out = response.getWriter();
		mm.remove(a);
		mm.add(b);
	
		out.println("<html>");
			out.println("<head>");			
			out.println("</head>");
			out.println("<body>");
			out.println("<table border='1' width='300'>");
			out.println("<tr>");
			out.println("<th>아이디</th>");
			out.println("<th>삭제</th>");
			out.println("<th>수정</th>");
			out.println("</tr>");
			if (b == null) {
				for (int i = 0; i < mm.size()-1; i++) {				
					out.println("<tr>");
					out.println("<th>" + mm.get(i) + "</th>");			
					out.println("<th><a href = 'delete?id="+mm.get(i)+"'>삭제</a></th>");			
					out.println("<th><a href = 'update?id="+mm.get(i)+"'>수정</a></th>");			
					out.println("</tr>");
				}
			} else {
				for (int i = 0; i < mm.size(); i++) {				
					out.println("<tr>");
					out.println("<th>" + mm.get(i) + "</th>");			
					out.println("<th><a href = 'delete?id="+mm.get(i)+"'>삭제</a></th>");			
					out.println("<th><a href = 'update?id="+mm.get(i)+"'>수정</a></th>");			
					out.println("</tr>");
				}

			}


			out.println("</table>");

			out.println("</body>");			
			out.println("</html>");
			out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
