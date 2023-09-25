package lib;

import prj1.ICalculator;

public class UsCalculator implements ICalculator{

	//�޼ҵ忡 ����� ������ ����
	
	@Override
	public int add(int su1, int su2) {
		System.out.println("�μ��� ���� "+(su1+su2)+"�Դϴ�.");
		return su1+su2;
	}
	
	public int minus(int su1, int su2) {
		System.out.println("ù��° ������ �ι�° ���� ���� "+(su1-su2)+"�Դϴ�.");
		return su1-su2;
	}
	
	public int multiply(int su1, int su2) {
		System.out.println("�μ��� ���� "+(su1*su2)+"�Դϴ�.");
		return su1*su2;
	}
	public int division(int su1, int su2) {
		System.out.println("ù��° ������ �ι�° ���� ������ "+(su1/su2)+"�Դϴ�.");
		return su1/su2;
	}
	
}
