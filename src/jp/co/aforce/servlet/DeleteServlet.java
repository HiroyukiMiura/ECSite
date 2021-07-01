package jp.co.aforce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Product;
import jp.co.aforce.dao.ProductDAO;

@WebServlet("/servlet/deleteServlet")
public class DeleteServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.getRequestDispatcher("/views/playerManagement.jsp").forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");

		String transitScreen = "/views/delete.jsp";

		String name = request.getParameter("name");

		if (request.getParameter("button").equals("戻る")) {

			transitScreen = "/views/playerManagement.jsp";

		} else if (request.getParameter("button").equals("削除")) {

			ProductDAO productDao = new ProductDAO();
			Product product = new Product();

			if (productDao.delete(name)) {

				product.setCommsg("削除に成功しました");
				request.setAttribute("product", product);
				transitScreen = "/views/success.jsp";

			} else {

				product.setCommsg("削除に失敗しました");
				request.setAttribute("product", product);
				transitScreen = "/views/false.jsp";

			}

		}

		request.getRequestDispatcher(transitScreen).forward(request, response);

	}

}
