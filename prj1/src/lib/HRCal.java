package lib;

import prj1.ICalculator;

public class HRCal implements ICalculator {

	@Override
	public int add(int su1, int su2) {
		System.out.println("HRcal입니다");
		return su1+su2;
	}
	
}
