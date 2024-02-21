class  StringBuilderBuffer1 {
	public static void main(String[] args) {
		String firstName = "Arun";
		String lastName = "Goswami";
		String fullName =  firstName + " "+ lastName;
		System.out.println(fullName);
		System.out.println(fullName.length()); //6

		for(int i=0; i<fullName.length(); i++) {
			System.out.println(fullName.charAt(i)); //7
			
		}
		System.out.println();
		System.out.println("Before convert \n"+fullName);
			System.out.println("After convert \n"+fullName.toUpperCase()); // 8
             
             // compareTO() method String
			if(firstName.compareTo(lastName)==0) {
				System.out.println("String equal");
			}else{
				System.out.println("String not equal");
				// equals()xd method
				System.out.println(firstName.equals(lastName));

			}
	}
}