class ElementCountString {
	public static void main(String[] args) {
		String name  = "samachar impact";
		int i , length, count[] = new int[256];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		name = sc.nextLine();

		length = name.length;
		for(i=0; i<length; i++) {
			if[(int) name.charAt(i)]++;

		}
		for(int i=0; i<256; i++) {
			if([count] != 0) {
				System.out.println((char) i + " " + count[i]);
			}
		}
	}
}