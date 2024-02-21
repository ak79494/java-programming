import java.util.*;
class HashMapClass {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap();
		map.put("india",100);
		map.put("Pakistan",140);
		map.put("Russia",90);
		map.put("England",130);
		System.out.println(map);

		// upgrade or change
		map.put("india", 130);
		System.out.println(map);  //add upgrade

	  // remove
		map.remove("Pakistan");
		System.out.println(map); // remove

		//  get()
		System.out.println(map.get("india")); // 130

		// containsKey()
		if(map.containsKey("india")) {
			System.out.println("Key is Present");
		}else{
			System.out.println("Key is not present");
		}
		for(Map.Entry<String,Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		Set<String> keys = map.keySet();
		for(String  key : keys) {
			System.out.println(key + " " +map.get(key));
		}
		
	}
}