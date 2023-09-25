package arraysEx;

import java.util.Arrays;
import java.util.Comparator;

 

public class ArraysEx {

	public static void main(String[] args) {
		 
		
		
		 Score[]  list = new  Score[4];		 
		 list[0]= new Score("김도기", 100,90);
		 list[1]=  new Score("장성철", 90 ,50);
		 list[2]=  new Score("온하준", 40 ,99);
		 list[3]=  new Score("안고은", 100 ,100);				 
		 
		 Arrays.sort( list,  new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Score s1= (Score)o1;
				Score s2 =(Score) o2;				
				
				return s1.kor-  s2.kor;
			}});		 
		 		 
		 System.out.println( Arrays.toString(list)); 
		 
		 
		 Arrays.sort( list, new Comparator<Score> () {
			@Override
			public int compare(Score o1, Score o2) {				 
				return o1.eng- o2.eng;
			}});
		 
		 System.out.println( Arrays.toString(list));		 
		 		 
		 Arrays.sort( list);		 
		 System.out.println( Arrays.toString(list));
		 
		
	}

}
