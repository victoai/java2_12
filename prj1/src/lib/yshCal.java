package lib;

import prj1.ICalculator;

public class yshCal implements ICalculator {

	@Override
	public int add(int su1, int su2) {
		return su1+su2;
	}
 
	public int minus(int su1, int su2) {
		return su1-su2;
	}

 
	public int mutif(int su1, int su2) {
		return su1*su2;
	}
 
	public double divid(int su1, int su2) {
		return (double)su1/su2;
	}

}
