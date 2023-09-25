package thread;

public class SimpleProgram {
	
	int su1;
	int su2;
	
	
	public SimpleProgram( int su1, int su2) {
		this.su1= su1;
		this.su2 = su2;
		
	}
	
	public int add( ) {
		int result;
		result = su1+su2;
		return result;
	}
	
	
	public static void main(String[] args) {
	
		SimpleProgram p = new SimpleProgram(3,5);
		int result  =p.add();
		System.out.println(  result);
		
		
	}

}
