package prj1;

import java.util.Scanner;

import lib.CIHCalculator;
import lib.CbjCalculator;
import lib.HRCal;
import lib.LswCalculator;
import lib.PIHcalculator;
import lib.PghCalculator;
import lib.UsCalculator;

public class NewCalculatorProgram4 {
	
	ICalculator calculator ; 	
	  
	public NewCalculatorProgram4(ICalculator calculator) {	   // 생성자주입  constructor  Injection  , 생성자를 통해서 계산기객체 주입
		this.calculator = calculator;
	}
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
		 NewCalculatorProgram4  newp = new  NewCalculatorProgram4 ( new LswCalculator());		 		 
		 newp.run();	
	}

}
