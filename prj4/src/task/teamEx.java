package task;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class teamEx {

	public static void main(String[]args) {
		
		//1.Runnable
		System.out.println("----1----");
		Runnable r = () -> System.out.println("9단 출력");
		
		r.run();
		Runnable r1 = () ->{
			for(int i=1; i<=9; i++){
				System.out.println(9*i);
			}
		};
		r1.run();
		
		//2.Supplier
		Supplier<String> supplier= ()-> "김선명과 헌조형님의 콜라보뤠이션~";

        String result = supplier.get();
        
        System.out.println("----2----");
        System.out.println(result);
		
        
        //3.Consumer
       
        System.out.println("----3----");
        ArrayList<String> list = new ArrayList<>();
		list.add("김선명");
		list.add("정헌조");
		list.add("콜라보");
		list.add("레이션");
		list.forEach( str -> System.out.println(str));
		list.forEach(str -> {System.out.println("김 : 정 ");
								System.out.println(str);
		});
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("--"+ t +"--");
				
			}});
	
		 Consumer<String> consumer = s -> System.out.println(s.concat(s));

	       consumer.accept("김김 선선 명명 ");

        
        
        
		//4. Function
		Function<Integer, Integer> f = x->x+x;
		Function<Integer, Integer> f2 = x->x*x;
		
		int result1 = f.apply(3);
		int result2 = f2.apply(4);
		
		System.out.println("----4----");
		System.out.println(result1);
		System.out.println(result2);
		
		//5. Predicate
		
		Predicate<String> p = s ->{
			if(s.equals("선명"))
				return true;
			else return false;
		};
		boolean result3 = p.test("선명");
		boolean result4 = p.test("헌조");
		System.out.println("----5----");
		System.out.println(result3);
		System.out.println(result4);
	}
}
