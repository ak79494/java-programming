class SubStrings {
	public static void main(String[] args) {
		String sentence = "My name is shradha";
		// substring
		//substring(beg index , end index)
		String name = sentence.substring(11,sentence.length());
		System.out.println(name);
		System.out.println(sentence.toUpperCase());
	}
}