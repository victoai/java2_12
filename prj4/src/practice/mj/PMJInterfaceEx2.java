package practice.mj;

import java.util.Scanner;
import java.util.function.Consumer;

public class PMJInterfaceEx2 {

	public static void main(String[] args) {
	
		// 클래스 정의
		PMJInterface pmj = new PMJInterfaceImp();
		pmj.stock("삼성전자");
		
		
		// 익명 클래스 작성
		Consumer<String> pmj2 = new Consumer<>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t + " 주식이 떨어졌슴다");
			}}; 
				
		 
		pmj2.accept("에코프로");
		
		
		// 람다식
		PMJInterface pmj3 = name -> System.out.println(name + " 거래정지되었습니다..");
		pmj3.stock("이브이첨단소재");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("가격 / 할인율 입력");
		int price = sc.nextInt();
		int percent = sc.nextInt();
		
		PMJInterface02 mj = new PMJInterface02(){
			@Override
			public int salePer(int price, int percent) {
				
				return price * percent /100;
			}
		};
		int result = mj.salePer(price, percent);
		
				
		PMJInterface02 mj1 = (num1, num2) -> num1 * num2 /100;
		int result2 = mj1.salePer(price, percent);
		
		System.out.println("익명클래스 : " + result);
		System.out.println("람다식  : " + result2);
		
	}
}

 
