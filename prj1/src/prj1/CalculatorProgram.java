package prj1;

import java.util.Scanner;
// 계산프로그램 
public class CalculatorProgram {	
		
	 
	Calculator  calculator;   //  의존 dependency 	
	//시작포인트
	public void run() {			
		//사용자에게 두 수 입력 받는다 
		int tmpsu1;	
		int tmpsu2;
		
		Scanner sc = new Scanner(System.in);
		tmpsu1= sc.nextInt();
		tmpsu2= sc.nextInt();		
		int result  =calculator.add(tmpsu1, tmpsu2);		
		System.out.println(" 두 수의 합은 " + result);		
	} 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		CalculatorProgram program = new CalculatorProgram();
		program.run();
	}
}
