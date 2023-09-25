package myarrays;

import java.util.Arrays;

public class MyArraysEx {

	public static void main(String[] args) {
		
		 Score[]  list = new  Score[4];		 
		 list[0]= new Score("김도기", 100,90);
		 list[1]=  new Score("장성철", 90 ,50);
		 list[2]=  new Score("온하준", 40 ,99);
		 list[3]=  new Score("안고은", 100 ,100);		 		 		 
		 
		 //직접
		 for( int i=0 ; i< list.length -1 ; i++) {                
			 
			 for( int j= i+1 ; j< list.length ; j++) {    
				 if(  list[i].kor > list[j].kor ) {
					  Score tmp;
					  tmp = list[i];
					  list[i]= list[j];
					  list[j] = tmp;
				 }
				                                                     
			 }			 
		 }	 		 
		 
		 System.out.println( Arrays.toString(list));
		 for( Score  s: list)
			 System.out.println( s);
		 
		 
		 // MyArrays.sort
		 
		 
		 MyArrays.sort(list, new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {    // 오름차순   기준(크)   비교(작다)
				  Score s1 = (Score) o1;
				  Score s2 = (Score) o2;
				  
				return  s1.eng - s2.eng;     //  오름차순
				// return s2.eng  - s1.eng  //   내림차순
			}});
		
		System.out.println( "==> 영어어점수기준 오름 차순 ");
		System.out.println( Arrays.toString( list));
	}

}
