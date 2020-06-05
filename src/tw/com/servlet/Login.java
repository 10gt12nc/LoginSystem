package tw.com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.dao.CustomerDao;
import tw.com.factory.CustomerFactory;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int i = 0;

		CustomerDao dao = CustomerFactory.getCustomerDaoFactory();
		int login = dao.getLoginCheck(username, password, i);
		int logname = dao.getUserNameCheck(username, i);
		int logpass = dao.getUserPassCheck(password, i);

		if (username == null || username.equals("") || password == null || password.equals("")) {
			request.setAttribute("message", "未填寫!");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
//			response.sendRedirect("Login.jsp");
			
		} else if (login > 0) {
			request.getRequestDispatcher("LoginOK.jsp").forward(request, response);

		} else if (login == 0) {

			if (logname == 0)
				response.sendRedirect("LoginWrongName.jsp");
			else if (logpass == 0)
				response.sendRedirect("LoginWrongPass.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
