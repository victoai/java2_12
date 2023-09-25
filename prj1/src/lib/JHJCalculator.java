package lib;

import prj1.ICalculator;

public class JHJCalculator implements ICalculator{

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("두수의 합은"+ (su1+su2) +"입니다.");
		return su1+su2;
	}
 
 
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("두수의 빼기는"+ (su1-su2) +"입니다.");
		return su1-su2;
	}

 
	public int ti(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("두수의 곱은"+ (su1*su2) +"입니다.");
		return su1*su2;
	}

 
	public double di(double su1, double su2) {
		// TODO Auto-generated method stub
		System.out.println("두수의 나누기는"+ (su1/su2) +"입니다.");
		return su1/su2;
	}

}
