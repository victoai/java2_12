package task;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class leran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Supplier<String> s = () ->"선수들이 입장합니다";
    
   System.out.println(s.get());
   
   Function<Integer, Integer> f2 = x -> {
		System.out.println("리버풀의 제라드의 환상의 중거리골!");
		return x;
		
	};
	
	int result =(f2.apply(1));

	int result2 =0;
	
   Predicate<String> p = var -> {
	  System.out.println("오프사이드 인거같은데요 ");
	   System.out.println("주심이 VAR를 확인합니다.");
		if( var.equals("골") ) return true;
		else return false;
	};
	
	if (p.test("골") == true) {
		System.out.println("득점 인정");
	}
	else {System.out.println("득점 취소");
	}
	
	
	
	
	
	
	System.out.println(result + " : " + result2);
   
   Runnable r = () -> {
	   System.out.println("경기 종료합니다");
	   System.out.println("리버풀의 1 : 0 승리");
	   System.out.println("리버풀이 안필드에서 챔피언 자리에 등극합니다");
   };
   
  r.run();
	}

}
