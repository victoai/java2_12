package generic;

import java.util.ArrayList;
 

class Person {
    String name;
    // 기본 생성자
    Person() {
    }

    // 생성자 오버로딩
    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

// Person 상속 Man 클래스
class Man extends Person {
	Man( String name){
	  super(name);
	 }
     
}

// Person 상속 Woman 클래스
class Woman extends Person {
  Woman( String name){
  super(name);
  }    
}




public class WildTest {

	public static void main(String[] args) {		 
		ArrayList<Person> listP = new ArrayList<Person>();
        listP.add(new Person("이사람"));
        listP.add(new Person("김사람"));
        printData(listP); 
       // printData2(listP); 

        // Man
        ArrayList<Man> listM = new ArrayList<Man>();
        listM.add(new Man("공유"));
        listM.add(new Man("스티브잡스"));
        printData(listM);  
        printData2(listM); 

        // Woman
        ArrayList<Woman> listW = new ArrayList<Woman>();
        listW.add(new Woman("아이유"));
        listW.add(new Woman("김연아"));
         printData3(listW);    
        // printData2(listW);   
    }

    // Man 클래스와 그 상위 클래스로 생성된 인스턴스만 매개변수로 전달 가능
    public static void printData(ArrayList<? super Man> list) {   
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
	 
    
    // Man 클래스와 그 하위 클래스로 생성된 인스턴스만 매개변수로 전달 가능
    public static void printData2(ArrayList<? extends Man> list) {   
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    
	     
    public static void printData3(ArrayList<? extends Woman> list) {   
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
