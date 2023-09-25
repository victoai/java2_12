package lib;

import prj1.ICalculator;

public class CIHCalculator implements ICalculator {

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		int result=su1+su2;
		System.out.println("👍inho");
		System.out.println(su1+"+"+su2+"="+result);
		return result;
	}
	
	

}
