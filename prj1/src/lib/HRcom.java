import java.util.Comparator;

public class HRcom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Food f1 = (Food)o1;
		Food f2 = (Food)o2;
		return f1.price-f2.price; 
	}
	
}
