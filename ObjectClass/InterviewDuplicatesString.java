class InterviewDuplicatesString {
	public static void removeDuplicates(String name) {
		String newname = new String();
		int length = name.length();
		for(int i=0; i<length; i++) {
			char charAtPosition = name.charAt(i);        
			if(newname.indexOf(charAtPosition) < 0) {
				name += charAtPosition;
			}
		}
		System.out.println(newname);

	}
	public static void main(String[] args) {
		String name = "shradha khapra";
		removeDuplicates(name);
	}
}                                 