package prj1;

import java.util.Scanner;

import lib.CIHCalculator;
import lib.CbjCalculator;
import lib.HRCal;
import lib.LswCalculator;
import lib.PIHcalculator;
import lib.PghCalculator;
import lib.UsCalculator;

public class NewCalculatorProgramTeacher {
	
	ICalculator calculator ; 	
	  
	public NewCalculatorProgramTeacher(ICalculator calculator) {	   // 생성자주입  constructor  Injection  , 생성자를 통해서 계산기객체 주입
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
		// 익명클래스  부모를 상속받으면서 클래스를 작성할때만 익명클래스로 만들 수 있다.
		// NewCalculatorProgramTeacher  newp = new  NewCalculatorProgramTeacher (  new ICalculator() {});	
		 NewCalculatorProgramTeacher  newp = new  NewCalculatorProgramTeacher (  new ICalculator() {
			@Override
			public int add(int su1, int su2) {
				// TODO Auto-generated method stub
				System.out.println(" wjy ");
				return  su1 + su2;
			}});	
		 newp.run();	
	}

}
