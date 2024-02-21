import java.util.*;
class TreeMapSort {
	public static void main(String[] args) {
		TreeMap<String,Integer> map = new TreeMap<>();
		map.put("India",130);
		map.put("Latvia",80);
		map.put("Russia",90);
		map.put("England",130);
		System.out.println(map);
		System.out.println("Size: "+ map.size());

		if(map.containsKey("India")) { 
			System.out.println("key is present");

		}else{
			System.out.println("key doesnot match");

		}
		System.out.println("First Country name: "+map.firstEntry());
		System.out.println("Last Country name: "+map.lastEntry());
	}
}
