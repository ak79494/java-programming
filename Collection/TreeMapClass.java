import java.util.*;
class TreeMapClass {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("india",100);
		map.put("Pakistan",140);
		map.put("Russia",90);
		map.put("England",130);

		for(Map.Entry<String,Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		

	}
}