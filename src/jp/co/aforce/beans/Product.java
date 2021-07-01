package jp.co.aforce.beans;

public class Product implements java.io.Serializable {

	private int id;
	private String name;
	private int price;
	private String emsg;
	private String commsg;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setId(int id ) {
		this.id=id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setPrice(int price) {
		this.price=price;
	}

	public String getEmsg() {
		return emsg;
	}

	public void setEmsg(String emsg) {
		this.emsg = emsg;
	}

	public String getCommsg() {
		return commsg;
	}

	public void setCommsg(String commsg) {
		this.commsg = commsg;
	}

}
