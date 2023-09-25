package task;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


//박혜리님
public class FoodEx {

	public static void main(String[] args) {
		Runnable r = ()->{System.out.println("---버킷리스트---");
						System.out.println("1. 강아지랑 해외여행");
						System.out.println("2. 기타로 좋아하는 곡 하나 완주");
		};
		r.run();
		
		//
		System.out.println("---카레재료구매---");
		Consumer<Integer> c = (money)->{
			money-=3000;
			System.out.println("감자구매 -3000");
			money-=4000;
			System.out.println("양파구매 -4000");
			money-=5000;
			System.out.println("고체카레 구매 -5000");
			money-=9000;
			System.out.println("돼지고기 구매 -9000");
			System.out.println("남은돈: "+money);
		};
		c.accept(30000);
		
		//
		System.out.println("---요리만들기---");
		Supplier<String> s = () ->
			"1. 감자를 깎습니다.\n"
			+ "2. 감자를 깍둑썰기 합니다.\n"
			+ "3. 양파도 껍질을 까고 적당한 사이즈로 썰어줍니다.\n"
			+ "4. 후라이팬에 돼지고기, 감자, 양파를 볶아 익혀줍니다.\n"
			+ "5. 큰 냄비에 볶은 재료들과 물을 넣어 잠시 끓여줍니다.\n"
			+ "6. 고체카레를 원하는 만큼 풀어줍니다.\n"
			+ "7. 약불에 조금 더 끊여줍니다.";
		;
		String result = s.get();
		System.out.println(result);
		
		
		//
		System.out.println("---요리입력---");
		String myFood="카레";
		System.out.println("요리를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String food1 = sc.nextLine();
		
		Function<String,Boolean> f =(food)->{
			if(food.equals(c)) {
				return true;
			}else {
				return false;
			}
		};
		
		Predicate<String> p = (food)->{
			if(food.equals(myFood))return true;
			else return false;
		};
		Boolean result2 = p.test(food1);
		System.out.println(result2);
		
		//
		System.out.println("수를 입력해주세요");
		int su =sc.nextInt();
		Function<Integer,String> f2 =(su1)->
			"제곱근: "+(su1*su1)+"\n"+"난수 반환:"+(int)(Math.random()*su1+1)+"\n";
		;
		String result3 = f2.apply(su);
		System.out.println(result3);
		
		//
		System.out.println("---화페매수 구하기---");
		System.out.println("금액을 임력해주세요");
		int mn = sc.nextInt();
		
		Function<Integer, String> f3= (mn1)->{
			String str = "";
			int[] arr = {10000,5000,1000,500,100,50,10};
			int[] arr2=new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				arr2[i]=(int)mn1/arr[i];
				mn1=mn1%arr[i];
				str += arr[i]+":"+arr2[i]+"\n";
			}
			return str;
		};
		String result4 = f3.apply(mn);
		System.out.println(result4);
	}

}
