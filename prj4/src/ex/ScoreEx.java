package ex;

import java.util.Arrays;
import java.util.Comparator;

public class ScoreEx {

	public static void main(String[] args) {
		 
		
		 Score[]  list = new  Score[4];		 
		 list[0]= new Score("김도기", 100,90);
		 list[1]=  new Score("장성철", 90 ,50);
		 list[2]=  new Score("온하준", 40 ,99);
		 list[3]=  new Score("안고은", 100 ,100);		
		 
		 // 정렬
		 // sort (  배열, Comparator )
		 
		 
		 Arrays.sort( list,  new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				   Score s1 = (Score) o1;
				   Score s2  =(Score) o2;				   
				return s1.kor - s2.kor;
			}} );
		 
		 
		 System.out.println(  Arrays.toString( list));  // 국어점수 오름차순		 
		 //람다식
		 
		 //Arrays.sort(  list, ( o1, o2) -> { return  o1.eng - o2.eng;}  );
		 Arrays.sort(  list, ( o1, o2) ->      o1.eng - o2.eng    );
		 System.out.println(  Arrays.toString(list));  //영어점수 오름차숨 
		
	}

}
