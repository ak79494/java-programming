import java.util.*;
class RemoveDulpiWithoutArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("India");
		list.add("latvia");
		list.add("Russia");
		list.add("Ukraine");
		list.add("Russia");
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
		System.out.println("Remove Duplicate Country: "+list);
	}
}