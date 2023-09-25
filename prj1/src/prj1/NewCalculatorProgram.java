package prj1;

import java.util.Scanner;

public class NewCalculatorProgram {
	
	ICalculator calculator =new GoogleCalculator();		
	
	public void run() {
		//  두 수를 입력 받아서 
		//  합계를 출력		
		Scanner sc = new Scanner(System.in);
		int tmpsu1 = sc.nextInt();
		int tmpsu2 = sc.nextInt();		
		int result  = calculator.add(tmpsu1, tmpsu2);
		System.out.println("두수으 합" +  result);
	}
	
	public static void main(String[] args) {	
		 NewCalculatorProgram  newp = new  NewCalculatorProgram ();
		 newp.run();
	
	}

}
