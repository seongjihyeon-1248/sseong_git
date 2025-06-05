package about;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//화면에서 'ctrl+shift+R'(새로고침)으로 실행가능
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Auto-generated method stub
		//먼저 aboutme.html로 열리게 함
		/*
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html"); 
		System.out.println("restart");
		dispatcher.forward(request, response); 
		*/
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 현재 시각 가져오기
        LocalDateTime now = LocalDateTime.now();
        // 원하는 형식으로 포맷
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        String formattedNow = now.format(formatter);
        
        // HTML 출력
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>현재 시각</title></head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<a href='index.html'> 메인화면</a>");
        out.println("<div>");
        out.println("<h1>현재 시간: " + formattedNow + "</h1>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
	}

}
