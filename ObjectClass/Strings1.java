class Strings1 {
	public static void main(String[] args) {
		String firstName = "Shradha";
		String lastName = "khapra";
		//comapre to digit
		//s1>s2 = +ve value
		//s1==s2 = 0
		//s1<s2 = -ve value
		if(firstName.compareTo(lastName) == 0) {
			System.out.println("Strings are equal");
		}else{
			System.out.println("Strings are not equal");
			System.out.println(firstName.equals(lastName));

			
			
			
		}
		
	}
}