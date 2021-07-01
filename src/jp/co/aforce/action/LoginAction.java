package jp.co.aforce.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.Customer;
import jp.co.aforce.dao.CustomerDAO;
import jp.co.aforce.tool.Action;

public class LoginAction extends Action {
	public String execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {

		HttpSession session=request.getSession();

		String login=request.getParameter("login");
		String password=request.getParameter("password");
		CustomerDAO dao=new CustomerDAO();
		Customer customer=dao.search(login, password);

		if (customer!=null) {
			session.setAttribute("customer", customer);

				if (request.getParameter("login").equals("三浦弘之")) {
					return "playerManagement.jsp";
				} else {
					return "product.jsp";
				}

		}

		return "login_error.jsp";
	}

}
