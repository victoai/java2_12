package generic;

public class ToyBox {
	Object[] obj;
	int index;	
	
	ToyBox(){
		obj = new Object[3];
	}		
	void add( Object toy) {
		obj[index]= toy;
		index++;
	}	
	
	Object get( int index) {
		return  obj[index];
	}
	public static void main( String[] args) {
		ToyBox box = new ToyBox();
		box.add( new Doll());
		box.add( new Car());
	}		
}
