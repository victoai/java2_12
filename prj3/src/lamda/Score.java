package lamda;

public class Score  implements Comparable<Score>{
	
	String name;
	int kor;
	int eng;
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}	 
	
	public Score() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public int compareTo(Score o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);   // 내가크면 양수, 작으면 음수    'a' :97 -'b':98
	}
	
	

}
