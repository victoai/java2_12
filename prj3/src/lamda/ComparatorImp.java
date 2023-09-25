package lamda;

import java.util.Comparator;

public class ComparatorImp  implements Comparator<Score> {
	@Override
	public int compare(Score o1, Score o2) {		 
		return o1.eng  - o2.eng;
	}

}
