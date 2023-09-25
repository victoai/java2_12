package lamda;

public class MyInterface2Ex {

	public static void main(String[] args) {
	 
		
		MyInterface2  f  =  () -> System.out.println(" hello lamda");
		f.print();
		
		// MyInterface2 f2 = new  MyInterface2() {};  // 익명클래스 정의 
			
		 MyInterface2 f2 = new  MyInterface2() {

			@Override
			public void print() {
				System.out.println(" hello 익명");
				
			}};  // 익명클래스 정의 		
			
		f2.print();
	}

}
