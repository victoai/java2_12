package lib;

import prj1.ICalculator;

public class PghCalculator implements ICalculator{

	@Override
	public int add(int su1, int su2) {
		System.out.println("PghCalcualtor");
		return su1 + su2;
	}
}