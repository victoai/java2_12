package lib;

import prj1.ICalculator;

public class LswCalculator implements ICalculator{


	public int squ(int su1) {
		System.out.println("제곱"+ su1 * su1);
		return su1*su1;
		
	}

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		return su1+su2;
	}
	
}
