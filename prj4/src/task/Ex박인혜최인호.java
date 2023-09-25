package task;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex박인혜최인호 {

	public static void main(String[] args) {
		
		Consumer<Integer> ex1=(n)->{
			for(int i=1; i<10; i++) {
				System.out.println(n+"×"+i+"="+n*i);
			}
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("구구단 출력");
		System.out.println("수를 입력하세요");
		int n=sc.nextInt();
		ex1.accept(n);
		
		Predicate<Integer> ex2=(y)->{
			int x=(int)(Math.random()*10);
			if(y==x) {
				return true;
			}else {
				return false;				
			}
		};
		
		System.out.println("랜덤 숫자 맞추기 0~9");
		System.out.println("수를 입력하세요");
		int y=sc.nextInt();
		boolean result222=ex2.test(y);
		System.out.println(result222);
		sc.close();
		
		//1.Runnable
		Runnable r = () -> System.out.println("강아지는귀엽다");
		r.run();

		//2.Supplier
		Supplier<String> s = () -> "고양이도";
		String result = s.get();
		Supplier<String> s1 = () -> "귀엽다";
		String result2 = s1.get();
		System.out.println( result + result2);
		
		// 4 입력, 반환
		Function<Integer, String> f = su -> { 
			return su > 0 ? "양수" : "음수";
		};
		System.out.println(f.apply(1)); 
		System.out.println(f.apply(-1));
		
	}

}
