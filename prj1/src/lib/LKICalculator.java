package lib;

import prj1.ICalculator;

public class LKICalculator implements ICalculator {

	@Override
	public int add(int su1, int su2) {
		System.out.println("이광일 계산기");
		return su1 + su2;
	}

}
