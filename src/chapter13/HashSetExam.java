package chapter13;  // 568p

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("JDBC");
		set.add("servlet/jsp");
		set.add("Ibatis");
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("iBATIS");

		//jdk 1.4까지
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		//jdk 1.5부터
		System.out.println();
		System.out.println("jdk 1.5 ~");
		for (String str : set) {
			System.out.println(str);
		}

		//함수형 프로그램
		System.out.println();
		System.out.println("jdk 1.8 ~");
		set.forEach(System.out::println);
		
	}
}
