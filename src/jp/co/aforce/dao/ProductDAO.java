package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.Product;

public class ProductDAO extends DAO {

	public List<Product> search(String keyword) throws Exception {
		List<Product> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
				"select * from product where name like ?");
		st.setString(1, "%"+keyword+"%");
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Product p=new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setPrice(rs.getInt("price"));
			list.add(p);
		}

		st.close();
		con.close();

		return list;
	}


	public boolean inputCheck(Product product) {
		if (product.getName().isEmpty() || product.getPrice() == 0) {
			return false;
		}
		return true;
	}

	public boolean insert(Product product) {
		boolean result = false;
		Connection con = null;
		PreparedStatement st = null;

		try {
			con = getConnection();
			st= con.prepareStatement("insert into product values(null,?,?)");

			st.setString(1, product.getName());
			st.setInt(2, Integer.valueOf(product.getPrice()));

			int line = st.executeUpdate();

			if (line > 0) {
				result = true;
			}
			st.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean delete(String name) {
		boolean result = false;
		Connection con = null;
		PreparedStatement st = null;

		try {
			con = getConnection();
			st= con.prepareStatement("delete from product where name=?");
			st.setString(1, name);

			int line = st.executeUpdate();

			if (line > 0) {
				result = true;
			}
			st.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean update(Product product) {
		boolean result = false;
		Connection con = null;
		PreparedStatement st = null;

		try {
			con = getConnection();
			st= con.prepareStatement("update product set name=?,price=? where id = ?");

			st.setString(1, product.getName());
			st.setInt(2, Integer.valueOf(product.getPrice()));
			st.setInt(3, Integer.valueOf(product.getId()));

			int line = st.executeUpdate();

			if (line > 0) {
				result = true;
			}
			st.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
