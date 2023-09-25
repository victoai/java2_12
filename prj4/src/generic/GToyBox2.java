package generic;

public class GToyBox2<T extends Toy> {
	Object[] obj;
	int index;		
	GToyBox2(){
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
		GToyBox2<Toy> box = new GToyBox2<>();
		// GToyBox2<Car> box2 = new GToyBox2<>();		
	}
}
