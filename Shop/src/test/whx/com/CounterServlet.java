package test.whx.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/Counter")
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CounterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		Integer count = (Integer) context.getAttribute("counter");
		if (count == null) {
			count = 1;
			context.setAttribute("counter", count);
		} else {
			context.setAttribute("counter", count + 1);
		}

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>统计网站访问次数</title></head>");
		out.println("<body>");
		out.println("<h2><font color='gray'>");
		out.println("您是第 " + context.getAttribute("counter") + " 位访客！");
		out.println("</font></h2>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

	public void destroy() {
		super.destroy();
	}
}
