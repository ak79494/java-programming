class Strings {
	public static void main(String[] args) {
		// concatenation
		String firstName = "Shradha";
		String lastName = "Khapra";
		String fullName = firstName + "@"+ lastName;
		System.out.println(fullName);
		System.out.println(fullName.length());

		//charAt
		for(int i=0; i<fullName.length(); i++) {
			System.out.println(fullName.charAt(i));
		}
		// convert capital letter
		System.out.println();
		System.out.println("Before convert \n"+firstName);
		System.out.println("After convert \n"+firstName.toUpperCase());

		// find character charAt()
		char result = fullName.charAt(0);
		System.out.println(result);	

		// contains()
		System.out.println(firstName.contains("Shradh"));
		System.out.println(firstName.contains("a"));

		char ans = fullName.charAt(4);
		System.out.println(ans);
	}
}