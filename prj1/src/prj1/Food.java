package prj1;



public class Food  implements Comparable{

	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Food() {
		// TODO Auto-generated constructor stub
	}
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Food  other  =( Food) o;		
		return this.price- other.price;   //내가크면 양수  ,   작으면 음수  
	}
	
	
}

