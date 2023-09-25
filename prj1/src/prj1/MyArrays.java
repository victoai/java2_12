package prj1;



public class MyArrays {

	
	public static void sort( Object[] arr , MyComparator c ) {		
		
		//
		for( int i =0 ; i< arr.length-1 ; i++) {
			for( int j=i+1; j< arr.length ; j++) {
				// i, j번재 비교 
				
				if(  c.compare(arr[i], arr[j])  >0  ) {  // 					
					Object tmp;
					tmp = arr[i];
					arr[i]= arr[j];
					arr[j]= tmp;				
					
				}
			}
		} 
		
	}
		
}
