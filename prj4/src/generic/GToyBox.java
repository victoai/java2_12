package generic;

public class GToyBox<T> {
	Object[] obj;
	int index;		
	GToyBox(){
		obj = new Object[3];
	}	
	
	void add( T toy) {
		obj[index]= toy;
		index++;
	} 	
	
	T  get( int index) {
		return (T) obj[index];
	}	
	
	public static void main( String[ ] args) {		
		GToyBox<Toy> box = new GToyBox<>();	
		GToyBox<Doll> box2 = new GToyBox<>();
		box2.add( new Doll());
		Doll doll  =box2.get(0);
		
		
		GToyBox<Object> box3 = new GToyBox<>();
		
		
	}
	
	
	
}
