package prj1;

import java.util.Scanner;
// 계산프로그램 
public class CalculatorProgram2 {	
		
	 
	Calculator  calculator = new Calculator();   //  의존 dependency 	 ,강한결합 
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
		CalculatorProgram2 program = new CalculatorProgram2();
		program.run();
	}
}
