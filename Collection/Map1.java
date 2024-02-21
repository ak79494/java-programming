import java.util.*;
class Map1 {
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("Shradha", 24);
		m.put("Aman", 26);
		m.put("Arun", 25);
		m.put("Payal", 20);
		System.out.println(m);
		System.out.println(m.get("Aman"));
		System.out.println(m.get("Arun"));

		Set<String> set = m.keySet();
		for(String key : set) {
			System.out.println(m.get(key));
		}
	}
}