package tw.com.bean;

import java.io.Serializable;

								//物件序列化
public class Customer implements Serializable {

	private int id;
	private String name;
	private String pass;

	public Customer() {
		super();
	}

	public Customer(int id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", pass=" + pass + "]";
	}

}
