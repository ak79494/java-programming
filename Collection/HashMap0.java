import java.util.HashMap;
class HashMap0 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Shradha",24);
		map.put("Aman",26);
		map.put("Arun",25);
		map.put("ApnaCollege",8);
		System.out.println(map);
		Set<Entry<String,Integer>> entrySet =  map.entrySet();
		for(Entry<String,Integer> entry : entrySet){
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}
}