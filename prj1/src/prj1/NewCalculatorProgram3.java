package prj1;

import java.util.Scanner;

import lib.CIHCalculator;
import lib.CbjCalculator;
import lib.HRCal;
import lib.PIHcalculator;
import lib.PghCalculator;
import lib.UsCalculator;

public class NewCalculatorProgram3 {
	
	ICalculator calculator ; 	
	
	public void setCalculator(ICalculator calculator) {// 주입받는다 . 써터 주입  ,외부에서 생성된 객체를 주입받는다 Injection (주입)
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
		 NewCalculatorProgram3  newp = new  NewCalculatorProgram3 ();
		 //newp.setCalculator( new KakaCalculator());
		 //newp.setCalculator( new UsCalculator());
		 //newp.setCalculator( new CbjCalculator());
		 //newp.setCalculator( new HRCal());
		// newp.setCalculator( new PghCalculator());
		 //newp.setCalculator( new PIHcalculator());
		 newp.setCalculator( new CIHCalculator());		 
		 newp.run();	
	}

}
