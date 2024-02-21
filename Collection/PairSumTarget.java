import java.util.*;
class PairSumTarget {
	public static boolean pairSum(ArrayList<Integer> list,int tar) {
		//bruteforce all pair found
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i) + list.get(j) == tar) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(26);
		list.add(24);
		list.add(28);
		list.add(18);
		int tar = 46;
		System.out.println(pairSum(list,tar));

	}
}