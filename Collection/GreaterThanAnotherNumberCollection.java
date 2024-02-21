class GreaterThanAnotherNumberCollection {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(6)
		list.add(20);
		list.add(24);
		for(Object obj : list) {
			if(obj > 19) {
				System.out.println(obj);
			}
		}


	}
}