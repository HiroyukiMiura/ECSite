package jp.co.aforce.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.Item;
import jp.co.aforce.tool.Action;

public class CartRemoveAction extends Action {
	@SuppressWarnings("unchecked")
	public String execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {

		HttpSession session=request.getSession();

		int id=Integer.parseInt(request.getParameter("id"));
		List<Item> cart=(List<Item>)session.getAttribute("cart");

		for (Item i : cart) {
			if (i.getProduct().getId()==id) {
				cart.remove(i);
				break;
			}
		}
		return "cart.jsp";
	}

}
