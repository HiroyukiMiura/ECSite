package jp.co.aforce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/manegementServlet")
public class ManagementServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.getRequestDispatcher("/views/playerManagement.jsp").forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");

		String transitScreen = "/views/playerManagement.jsp";

		if (request.getParameter("button").equals("選手登録")) {

			transitScreen = "/views/regist.jsp";

		} else if (request.getParameter("button").equals("選手削除")) {

			transitScreen = "/views/delete.jsp";

		} else if (request.getParameter("button").equals("選手変更")) {

			transitScreen = "/views/update.jsp";

		}

		request.getRequestDispatcher(transitScreen).forward(request, response);

	}

}
