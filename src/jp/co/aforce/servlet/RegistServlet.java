package jp.co.aforce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Product;
import jp.co.aforce.dao.ProductDAO;

@WebServlet("/servlet/registServlet")
public class RegistServlet extends HttpServlet {

	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		request.getRequestDispatcher("/views/playerManagement.jsp").forward(request, response);
	}

	@Override
	public void doPost (HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");

		String transitScreen = "/views/regist.jsp";

		String button = request.getParameter("button");

		if (button.equals("")) {
			transitScreen = "/views/regist.jsp";
		} else {

			if (request.getParameter("button").equals("戻る")) {

				transitScreen = "../views/playerManagement.jsp";

			} else {

				Product product = new Product();
				product.setName(request.getParameter("name"));
				product.setPrice(Integer.parseInt(request.getParameter("price")));

				ProductDAO productDao = new ProductDAO();

				if (productDao.inputCheck(product)) {

						if (productDao.insert(product)) {

							product.setCommsg("登録に成功しました");
							request.setAttribute("Product", product);
							transitScreen = "/views/success.jsp";

						} else {

							product.setCommsg("登録に失敗しました");
							request.setAttribute("Product", product);
							transitScreen = "/views/false.jsp";

						}

				} else {

					product.setEmsg("入力されていない項目があります");
					request.setAttribute("Product", product);

				}

			}

		}

		request.getRequestDispatcher(transitScreen).forward(request, response);

	}

}
