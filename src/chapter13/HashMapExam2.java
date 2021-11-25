package chapter13;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);

		
		for (Map.Entry<Student, Integer> entry : map.entrySet()) {
			Student key = entry.getKey();
			Integer val = entry.getValue();
			System.out.printf("key: %s, val: %d", key, val);
		}
		
		System.out.println();
		System.out.println("총 Entry 수 : " + map.size());
		
	}
}
