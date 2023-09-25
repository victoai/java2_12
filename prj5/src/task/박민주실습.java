package task;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class 박민주실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Runnable r = () ->{
			System.out.println("박민주의 버킷리스트");
			System.out.println("1. 3만원으로 장보기");
			System.out.println("2. 요리를 잘하기..");
			System.out.println("3. 불로소득으로 먹고 살기");
			System.out.println("===================");
			
			System.out.println("저의 첫번째 버킷리스트를 실현해보겠습니다.");
			System.out.println("*******3만원으로 장보기*******");
			int money = 30000;


			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(1,15000);
			map.put(2,30000);
			map.put(3,10500);
			map.put(4,1000);
			map.put(5,1200);
			map.put(6,1000);
			map.put(7,3000);
			map.put(8,2000);
			map.put(9,2000);
			map.put(10,3500);
			map.put(11,3300);
			map.put(12,4300);
			HashMap<Integer, String> map1 = new HashMap<Integer, String>();
			map1.put(1, "돼지고기1kg");
			map1.put(2, "소고기1kg");
			map1.put(3, "닭고기1kg");
			map1.put(4, "마늘20알");
			map1.put(5, "소주");
			map1.put(6, "양파1개");
			map1.put(7, "대파한단");
			map1.put(8, "설탕");
			map1.put(9, "소금");
			map1.put(10, "굴소스");
			map1.put(11, "간장");
			map1.put(12, "브로콜리");
			for(int i = 1 ; i<=12 ; i++){
				System.out.println(i + ". " + map1.get(i) + " : " + map.get(i) + "원");
			}

			Consumer<Integer> c =  num -> System.out.println(map1.get(num) + "을 담았습니다. ");

//			
			
			while(true){
				int num = Integer.parseInt(sc.nextLine());
				if(num < 1 || num >12){
					System.out.println("없는 숫자야~종료할게");
					break;
				}
				c.accept(num);
				money = money - map.get(num);
				System.out.println("남은돈 : " + money);
				if(money <= 0){
					System.out.println("돈이 없어 더 이상 못사는군");
					break;
				}
			}
			
			Supplier<String> s = () ->  "그래 난 동파육을 만들고 싶었어";

			Supplier<String> s1 = () -> "아니 난 동파육을 만들거야";
			
			Supplier<String> recipe = () -> "1. 돼지 고기를 50분간 삶는다\n2"
					+ " 냄비에 물3컵 , 간장8스푼, 소주 5스푼, 설탕 6스푼, 굴소스 1.5스푼 , 통마늘 7알로 소스를 만든다\n"
					+ "3. 삶은 돼지 고기를 프라이팬에 겉면을 돌려가며 굽는다\n"
					+ "4. 만들어둔 소스에 고기를 한 입크기로 잘라 넣는다\n"
					+ "5. 소스가 바닥까지 남도록 졸인다.\n"
					+ "6. 그릇에 담아 맛있게 먹는다.";

			System.out.println("\n\n=======================\n\n");
			System.out.println("두 번째 버킷리스트 요리만들기를 해보자");
			System.out.println("1. 제육볶음  2. 동파육  3. 김치찌개");
			System.out.print("무엇을 만들까?");
			int num1 =  Integer.parseInt(sc.nextLine());
			if(num1 == 1 || num1 ==3){
				System.out.println(s1.get());
			}else{
				System.out.println(s.get());
			}
			System.out.println("***동파육 레시피***");
			System.out.println(recipe.get());


		};
		
		r.run();
		System.out.println("\n\n=======================\n\n");
		Predicate<String> p = food ->{
			if(food.equals("동파육")){
				System.out.println("그래 맞아");
				return false;
			}else{
				System.out.println("동파육이잖아 다시 !");
				return true;
			}
			
		};
		
		boolean escape= true;
		String food;
		while(escape){
			System.out.println("내가 만든 요리 이름은?");
			food = sc.nextLine();
			escape = p.test(food);
		}
		System.out.println("\n\n=======================\n\n");
		System.out.println("오늘 행운의 숫자나 구해보자");
		System.out.println("원하는 범위는?");
		int lucky = Integer.parseInt(sc.nextLine());
		
		Function<Integer, Integer> f = su -> (int)(Math.random()*su);
		System.out.println(f.apply(lucky));
		
		
		BiConsumer<Integer, Integer> bc = (su1, su2) -> {
			int a1 = (int)(Math.random()* 4);
			int a2 = (int)(Math.random()* 4);
			if(a1 == su1 && a2 == su2){
				System.out.println("정답!!");
			}else{
				System.out.println("오답ㅜㅜ");
			}
		};
		System.out.println("\n\n=======================\n\n");
		System.out.println("****랜덤 숫자 맞추기 !****");
		System.out.println("1~3 숫자 하나입력 1");
		int su1 = Integer.parseInt(sc.nextLine());
		System.out.println("1~3 숫자 하나입력 2");
		int su2 = Integer.parseInt(sc.nextLine());
		bc.accept(su1, su2);
		
		BiFunction<String, String, String> bf = (color, todaylunch) -> color + todaylunch;
		System.out.println("당신이 입고있는 바지 색은?");
		String color = sc.nextLine();
		System.out.println("당신이 먹은 점심메뉴 이름은?");
		String todaylunch = sc.nextLine();
		String bandname = bf.apply(color,todaylunch);
		System.out.println("당신이 인디밴드를 만든다면 이름은  " + bandname + " 입니다..");
		System.out.println("\n\n=======================\n\n");
		BiPredicate<Integer, Integer> bp = (mem1, mem2) -> {
			int aespar = 4;
			int newjeans = 5;
			if(su1 == aespar && su2 == newjeans ){
				return true;
			}else{
				return false;
			}
		};
		
		System.out.println("에스파의 멤버수는?");
		int mem1 = Integer.parseInt(sc.nextLine());
		System.out.println("뉴진스의 멤버수는?");
		int mem2 = Integer.parseInt(sc.nextLine());
		
		boolean answer = bp.test(mem1, mem2);
		
		if(answer){
			
			System.out.println("공부만 하지말고 TV좀 보세요 ㅜㅜ");
		}else{
			System.out.println("TV만 보지말고 공부좀하세요 ㅠㅜ");
		}
		
	}
}

