package chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		
		//객체 찾기 
		System.out.println("\t홍길동: " + map.get("홍길동"));
		System.out.println();

		
		//객체를 하나씩 처리
		
		// jdk 1.4 부터
//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIterator = keySet.iterator();
//		while(keyIterator.hasNext()) {
//			String key = keyIterator.next();
//			Integer val = map.get(key);
//			System.out.println("\t" + key + " : " + val);
//		}
//		System.out.println();
		
		// jdk 1.5 부터
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("key: " + key + ", value: " + val);
		}		
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();

		
//		객체를 하나씩 처리
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
//		
//		while(entryIterator.hasNext()) {
//			Map.Entry<String, Integer> entry = entryIterator.next();
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println("\t" + key + " : " + value);
//		}
//		System.out.println();

		//jdk 1.8 부터
//		Set<String> keySet = map.keySet();
//		keySet.forEach(System.out::println);
		
		//jdk 1.8 부터 람다 활용		
		map.forEach((t,u) -> System.out.printf("key: %s, value: %d\n", t, u));
		

		//객체 전체 삭제
		map.clear();
		System.out.println();
		System.out.println("총 Entry 수 : " + map.size());
				
	}
}
