package task;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Supplier<String> s = () -> "Hello Supplier";
		System.out.println(s.get());

		Function<String, String> f = t -> "당신의 이름은 "+t;
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.println(f.apply(name));
		
		Predicate<Integer> p = t -> {if(t==81)return true; else return false;};
		System.out.print("9 x 9는?: ");
		int age = sc.nextInt();
		Boolean b = p.test(age);
		if(b==true) {
			System.out.println("정답");
		}else {
			System.out.println("틀림");
		}
		
		Consumer<String> c = t -> System.out.println(t);
		System.out.print("아무 말 입력: ");
		String str = sc.next();
		c.accept(str);
		
		Runnable r1 = () -> System.out.println("Bye Runnable");
		r1.run();

	}
}

