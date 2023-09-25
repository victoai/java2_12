package task;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CoffeeEx {

	public static void main(String[] args) {

		Supplier<String> food = () -> "메뉴를 입력하시오. "
				+ "1. 아메리카노  2. 라떼  3. 자몽에이드";
				String menu = food.get();
				System.out.println(menu);
				
		Scanner sc = new Scanner(System.in);
		int  m = sc.nextInt();
		switch (m) {
			case 1:
				Function<Integer, Integer> food1 = a -> {
					System.out.println("아메리카노 : " + a + "원");
						return a;
					};
					Integer prize1 = food1.apply(3000);
				break;
			case 2:
				Function<Integer, Integer> food2 = a -> {
					System.out.println("라떼 : " + a + "원");
						return a;
					};
					Integer prize2 = food2.apply(3500);
				break;
			case 3:
				Function<Integer, Integer> food3 = a -> {
					System.out.println("자몽에이드 : " + a + "원");
						return a;
					};
					Integer prize3 = food3.apply(5000);
				break;
	
			default:
				System.out.println("다시 입력");
				break;
		}
				
				
		
		
	}

}
