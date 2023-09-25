package ex;

public class Ex3 {

	public static void main(String[] args) {
		 	
		
		
		//인터페이스 구현 1,2,3
		// 인터페이스를 상속(implements)받아서 클래스를 작성하는것  
		// 1.클래스이름  ,2.익명클래스  3.람다식 
		
		Interface3Imp  i = new Interface3Imp();
		int result = i.method(5);		
	 		
		
		Interface3  i2= new Interface3() {

			@Override
			public int method(int x) {				 
				return x*x;
			}} ;
		
		int result2  =i2.method(5);				
		Interface3 i3=  x -> x*x;
		int result3 = i3.method(5);		
				
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);

	}

}
