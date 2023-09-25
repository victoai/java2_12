package lamda;

public class SimplePro {

	public static void main(String[] args) {	
		CalculatorI  c  = new CalculatorI() {
			@Override
			public int add(int su1, int su2) {
			 
				return  su1+su2;
		 }};
		 
		int result  =c.add(3, 5);			 
		CalculatorImp c2 = new CalculatorImp();
		int result2 = c2.add(3, 5);		
		CalculatorI c3 = (a,b)->a+b ;
		int result3 = c3.add(3, 5);		
		 System.out.println( result);
		 System.out.println( result2);
		 System.out.println( result3);
		
		
	}

}
