package task.박근현_최범준;

import java.util.ArrayList;

public class Coffee {
	
	String menu;
	int price;
	public Coffee() {
	
	}
	public Coffee(String menu, int price) {
		super();
		this.menu = menu;
		this.price = price;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "메뉴 이름: " + menu + ", 가격: " + price;
	}
	
 

}
