package task2.mj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


public class CustomerEx민주 {

	public static void main(String[] args) {

		
		String[] list0 = new String[5];
		list0[0] = "vvip";
		list0[1] = "vip";
		list0[2] = "vip";
		list0[3] = "vip";
		list0[4] = "vvip";
		
		int cnt0 = (int) Arrays.stream(list0).filter(str -> str.equals("vip")).count();
		System.out.println(cnt0);
		Arrays.stream(list0).filter(str->str.equals("vvip")).forEach(str->System.out.println(str));
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(600);
		list1.add(700);
		list1.add(68000);
		list1.add(9900);
		list1.add(200);
		
		list1.stream().sorted().forEach( num -> System.out.println(num));
		
		
		
		ArrayList<Customer민주> list = new ArrayList<>();
		list.add(new Customer민주("a001", "홍길동", "vvip", 12000));
		list.add(new Customer민주("a002", "김길동", "vip", 8000));
		list.add(new Customer민주("b001", "최길동", "bronze", 500));
		list.add(new Customer민주("b002", "고길동", "bronze", 600));
		list.add(new Customer민주("c001", "박길동", "vip", 9000));
		list.add(new Customer민주("c002", "홍길순", "vip", 8500));
		list.add(new Customer민주("d001", "김길순", "vvip", 13000));
		list.add(new Customer민주("d002", "최길순", "vip", 9200));
		list.add(new Customer민주("e001", "고길순", "bronze", 300));
		list.add(new Customer민주("e002", "박길순", "bronze", 400));
		
		long gradecnt = list.stream().filter(customer -> customer.getGrade().equals("vvip")).count();
		Consumer<Long>  c = num -> System.out.println("vvip회원 수 :" + num);
		c.accept(gradecnt);
		
		System.out.println("vip인 사람만 출력");
		list.stream().filter(customer -> customer.getGrade().equals("vip"))
					.forEach(str -> System.out.println(str));
		
		System.out.println("point 순 정렬");
		list.stream().sorted((c1,c2)-> c1.point - c2.point).forEach(str -> System.out.println(str));
		System.out.println("이름 순 정렬");
		list.stream().sorted().forEach(str -> System.out.println(str));
		
		
		System.out.println(" 등급");
		list.stream().sorted( Comparator.comparing(o-> ((Customer민주)o).getGrade() )).forEach( s->System.out.println(s));
	}

}
