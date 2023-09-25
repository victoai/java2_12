package lib;

import prj1.ICalculator;

public class MinjuCalculator implements ICalculator{

	@Override
	public int add(int su1, int su2) {
		System.out.println("Minju's Calculator : 입력 받은 두 수 의 제곱을 더함");
		int result = su1*su1 + su2*su2;
		return result;
	}

	
}
