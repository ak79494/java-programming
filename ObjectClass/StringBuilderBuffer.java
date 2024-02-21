class StringBuilderBuffer {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("A");
		sb.append("r");
		sb.append("u");
		sb.append("n");
		System.out.println(sb); // 1
         
         //add element
		sb.insert(4, "G");
		System.out.println(sb); //2

		//delete
		sb.delete(4,5);
		System.out.println(sb); // 3

        //set element in between
		System.out.println("Set element");
		sb.setCharAt(0, 'S');
		System.out.println(sb); // 4

		 // delete
		sb.delete(0,1);
		System.out.println(sb);

		sb.insert(0, 'A');
		System.out.println(sb);

        // reverse method
        sb.reverse();
        System.out.println(sb); // 5

        // length() find character
        System.out.println(sb.length());    
	}
}