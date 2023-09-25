package Gmyarrays;

import java.util.Arrays;

public class MyArraysEx2 {

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
		 
		 MyArrays2.sort(list, new MyComparator2<Score>() {

			@Override
			public int compare(Score o1, Score o2) {
				// TODO Auto-generated method stub
				return 0;
			}

			 });
		
		System.out.println( "==> 영어어점수기준 오름 차순 ");
		System.out.println( Arrays.toString( list));
	}

}
