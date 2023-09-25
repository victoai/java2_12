package generic;

import java.util.ArrayList;

import myarrays.Score;

public class Ex01 {

	public static void main(String[] args) {
	 
		ArrayList list = new ArrayList();				
		list.add("hello");
		list.add( new Score("hong", 100,90));

				
		ArrayList list2 = new ArrayList();
		list2.add(new Score("김도기", 100,90));
		list2.add( new Score("장성철", 90 ,50));
		list2.add(  new Score("온하준", 40 ,99));
		list2.add(  new Score("안고은", 100 ,100));		 		 		 
		 
		
	  Object  o  =	list.get(0);
	//  Score  s  =  list.get(0);    // 상속관계  형변환 , 업캐스팅, 다운캐스팅
	  
	  
	  
	  Object obj  ;
	  obj = new Score("이광일", 100,100);    // 업캐스팅 , 부모형으로 다루는것 ,  자동형변환 cast   
	  
	  //Score score = obj ;   // 다운캐스팅 , 명시적형변환 
	   Score score = (Score) obj ;   // 다운캐스팅 , 명시적형변환 
	  	
	   //
	   Animal  animal  = (Animal)obj;     // 문법적으로 허용됨  , 실행하면 오류발생
	   int age = animal.getAge();
	   System.out.println( age);
	   	   
	   String name = score.getName();
	   System.out.println( name);
	  
	  
	   // 클래스를 작성 ,  다운캐스팅, 업캐스팅  , 다운캐스팅시 실행할 때  오류가 발생되는 상황 
	   // 예제만들기
	   // 자바는 상속관계에서 업캐스팅과 다운캐스팅이 가능하다 
	  
			  
	  
	  
		
		
		
		
		
		
		
		
		

	}

}
