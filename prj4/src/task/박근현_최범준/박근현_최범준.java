package task.박근현_최범준;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 박근현_최범준 {

	public static void main(String[] args) {
		
		System.out.println("Consumer 예제 - 커피 ");
		
		// 매개변수O, 반환값X -> accept 메소드를 활용함
				Consumer<Mynumber> c4 = num ->System.out.println(num.getNum());
				
				c4.accept((Mynumber) new Mynumber() {  // a 익명클래스 사용

					public int getNum() {

						return 100;

					}

				});
				
				c4.accept(() -> {  //b 방법 

					return 200;

				});
				
				System.out.println();
				System.out.println("====================");
				System.out.println();
				
	System.out.println("Supplier 예제 - 커피 ");
	
	//매개변수X, 반환값o get 메소드 활용. 데이터를 공급하는 역할.
	
			Supplier<Coffee> s3 = () -> new Coffee("카페라떼", 5500);

			Coffee u = s3.get(); // u라는 user 객체는 s3 에서 반환값 가져오기.

			System.out.println(u); 
			
			Supplier<List<Coffee>> s4 = () -> {

				  List<Coffee> list = new ArrayList<Coffee>();

					list.add(new Coffee("카페라떼", 5500));

					list.add(new Coffee("카푸치노", 5700));

					list.add(new Coffee("아메리카노", 5000));

					return list;

				};

				for (Coffee user : s4.get()) {

					System.out.println(user);

				}

		
				System.out.println();
				System.out.println("====================");
				System.out.println();
				
		
		System.out.println("Function 예제 - 커피 할인받기");
		
	
		
		Function<Coffee, Integer> result = coffee -> (int)(coffee.getPrice()*1/5);
		
		System.out.println("커피 할인율: 20%");
		System.out.println("주문한 커피: 아메리카노, 금액: 5000원");
		System.out.println("결제할 금액: ");
		
		System.out.println(result.apply(new Coffee("아메리카노", 5000)));
		
		
		
		
		
		
		System.out.println();
		System.out.println("====================");
		System.out.println();
		
		
		
		
		System.out.println("Predicate 예제 - 금액 부족시 결제 불가");
		
		Predicate<Coffee> p1 = s->((s.getPrice())) >= 5500;
		
		
		
		System.out.println(p1.test(new Coffee("카푸티노", 5700))?"결제 가능":"결제 불가");

	}
}