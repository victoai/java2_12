package lamda;

import java.util.Arrays;
import java.util.Comparator;

 

public class ArraysEx {

	public static void main(String[] args) {
		 
		
		
		 Score[]  list = new  Score[4];		 
		 list[0]= new Score("김도기", 100,90);
		 list[1]=  new Score("장성철", 90 ,50);
		 list[2]=  new Score("온하준", 40 ,99);
		 list[3]=  new Score("안고은", 100 ,100);				 
		 
		 //1.
		 Arrays.sort(list, new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {				 
				return o1.eng- o2.eng;
			}});	 
		 		 		 
		 System.out.println( Arrays.toString(list));		 		 		 
		 
		//2. 
		 Arrays.sort(list, new ComparatorImp());
		 System.out.println( Arrays.toString(list)); 
		 
		//3.  람다식
		 Arrays.sort( list,  (o1, o2)-> o1.kor- o2.kor);
		 System.out.println( Arrays.toString(list));
		 
		 
		
	}

}


