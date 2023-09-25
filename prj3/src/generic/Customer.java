package generic;

public class Customer {
	
	String name;  // 멤버변수, 인스턴스변수 
	String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
	public Customer(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
}
