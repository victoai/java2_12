package lamda;

import java.util.Scanner;

public class Program {
	 CalculatorI calculator ; 	  
	public void setCalculator(CalculatorI calculator) {
		this.calculator = calculator;
	}		
	public int add(int su1, int su2) {		
		int result  = calculator.add(su1, su2);
		return result;
	}	
	public void run() {
		System.out.println( " 두 수 입력하세요");
		Scanner sc = new Scanner(System.in );			
		int tmp1 , tmp2;
	    tmp1=sc.nextInt();
	    tmp2 = sc.nextInt();	    
	    int result  =add( tmp1, tmp2);
	    System.out.println( "두 수의 결과" +  result);	 
	}
	public static void main(String[] args) { 
		  Program program = new Program();
		/*  program.setCalculator( new CalculatorI() {
			@Override
			public int add(int su1, int su2) { 
				return su1+ su2;
			}});
		  */
		  program.setCalculator( (su1, su2) -> su1+su2);
		  program.run();
	}

}
