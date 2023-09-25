package generic;

import myarrays.Score;

public class CustomerEx {

	public static void main(String[] args) {
		 
		OList list = new OList();
		
		list.add( new Customer("김도기" ,"a001"));
		list.add( new Customer("온하준" ,"b001"));
		list.add( new Customer("박주임" ,"c001"));
				
	
	//	Object o  = ( Customer )list.get(0);	
		Customer c  = ( Customer )list.get(0);    // 다운캐스팅 직접  , 성공
		
		System.out.println( c.getName());
		
		
		GList<Customer> glist = new GList<>();		
		glist.add( new Customer("김도기" ,"a001"));
		glist.add( new Customer("온하준" ,"b001"));
		glist.add( new Customer("박주임" ,"c001"));
		
		Customer c2 = glist.get(0);
		
		
		

	}

}
