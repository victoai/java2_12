package task;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//이광일님
public class Practice {

	public static void main(String[] args) {
		// 1. Runnable
		Runnable r = () -> System.out.println("하하핳하");
		r.run();

		System.out.println("-------------------------------");
		// 2. Consumer
		Consumer<Integer> i = t -> {
			System.out.println("돼지고기 10000원");
			t -= 10000;
			System.out.println("남은돈 = " + t + "\n");

			System.out.println("김치 7000원");
			t -= 7000;
			System.out.println("남은돈 = " + t + "\n");

			System.out.println("다진마늘 3000원");
			t -= 3000;
			System.out.println("남은돈 = " + t + "\n");

			System.out.println("양파 4000원");
			t -= 4000;
			System.out.println("남은돈 = " + t + "\n");
			
			System.out.println("두부 1000원");
			t -= 1000;
			System.out.println("남은돈 = " + t + "\n");

			System.out.println("그 외 양념 5000원");
			t -= 5000;
			System.out.println("남은돈 = " + t);
		};

		i.accept(30000);
		
		System.out.println("-------------------------------");

		// 3. Supplier
		Supplier<String> s = () -> {
			System.out.println("1. 김치와 돼기고기를 볶는다");
			System.out.println("2. 물을 넣어서 끓여준다");
			System.out.println("3. 양념을 넣는다");
			System.out.println("4. 물이 끓으면 양파와 두부를 넣는다");
			System.out.println("5. 이제 한번 더 끓여주면");
			return "김치찌개";
		};
		String cook = s.get();
		System.out.println(cook + " 완성~");
		
		System.out.println("-------------------------------");

		// 4. Predicate
		Predicate<String> p = c -> {
			if (c.equals("김치찌개"))
				return true;
			else
				return false;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("내가 만든 요리는?");
		String q = sc.nextLine();

		boolean tf = p.test(q);

		if (tf == true)
			System.out.println("정답");
		else
			System.out.println("땡");
		
		System.out.println("-------------------------------");

		// 5. Function
		Function<Integer, String> f = it -> {
			if (it == 26)
				return "정답";
			else
				return "땡";
		};
		System.out.println("저의 나이는?");
		int age = sc.nextInt();

		String answer = f.apply(age);
		System.out.println(answer);
		
	}

}
