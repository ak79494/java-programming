import java.util.HashSet;
class HashSet0 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(3);
		set.add(2);
		set.add(0);
		set.add(5);
		set.add(1);
		System.out.println(set); // 0 1 2 3 5
		System.out.println(set.add(2));  // false duplicate
		//System.out.println(set.add(1)); // false duplicate
		//contains 
		if(set.contains(0)){
			System.out.println("0 is present");
		}else{
			System.out.println("0 is not present");

		}
		while(!set.isEmpty()) {
			System.out.println(set);
			set.clear();
			int size = set.size();
			System.out.println(size);

		}
		

		
	}
}