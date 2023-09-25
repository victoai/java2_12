package lib;

import prj1.ICalculator;

public class kbjcalculator implements ICalculator{

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("두수의 합은 "+ su1 +su2+"입니다");
		return su1+su2;
	}

	
}
