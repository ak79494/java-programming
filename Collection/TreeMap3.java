import java.util.*;
class TreeMap3 {
	public static void main(String[] args) {
		TreeMap<String,Integer> map = new TreeMap<>();
		map.put("Arun",100);
		map.put("Payal",101);
		map.put("Shradha",104);
		map.put("sonu",101);
		for(Map.Entry<String,Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key+" "+map.get(key));
		}

	}
}