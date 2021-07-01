package jp.co.aforce.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.Item;
import jp.co.aforce.dao.PurchaseDAO;
import jp.co.aforce.tool.Action;

public class PurchaseAction extends Action {
	@SuppressWarnings("unchecked")
	public String execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {
		HttpSession session=request.getSession();

		String name=request.getParameter("name");
		String agreement=request.getParameter("agreement");
		if (name.isEmpty() || agreement.isEmpty()) {
			return "purchase_error_empty.jsp";
		}

		PurchaseDAO dao=new PurchaseDAO();
		List<Item> cart=(List<Item>)session.getAttribute("cart");
		if (cart==null || !dao.insert(cart, name, agreement)) {
			return "purchase_error_insert.jsp";
		}

		session.removeAttribute("cart");
		return "purchase_out.jsp";
	}

}
