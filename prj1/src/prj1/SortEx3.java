package prj1;

public class SortEx3 {

	public static void main(String[] args) {
		
		
		Food[] foods = new Food[3];
		foods[0] = new Food( "크림파스타" , 15000);
	    foods[1] = new Food( "돌솥비빔밥" , 11000);
	    foods[2] = new Food( "쫄면" , 7000);
		
	    
	    
	    MyArrays.sort(foods,  new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {

				Food f1 = (Food)o1;
				Food f2 = (Food)o2;
				
				return f1.price - f2.price;   // 앞이 크면 양수,  뒤가 크면 음수 
			}});
		
		
		for( Food food: foods)
			 System.out.println( food);
	    

	}

}
