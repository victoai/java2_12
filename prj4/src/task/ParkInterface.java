package task;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class ParkInterface {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i=1 ; i<=5; i++){
				for(int j=1; j<=5; j++){
					System.out.print("*");
				}System.out.println();
			}
		};
		r.run();
		
		Supplier<Integer> s = () -> (int)(Math.random()*10);
		
		int result = s.get();
		System.out.println(result);
		
		Consumer<Integer> c = x -> System.out.println(x*x);
		c.accept(5);
		
		Function<String, String> f = name -> name + "님 안녕하세요";
		String result2 = f.apply("홍길동");
		System.out.println(result2);
		
		
		Predicate<Integer> p = num ->{
			if(num == 1){
				return true;
			}else{
				return false;
			}
			
		};
		boolean result3 = p.test(1);
		System.out.println(result3);
		
	}	
}
