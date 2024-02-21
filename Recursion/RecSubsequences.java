class RecSubsequences {
	public static void subSequences(String str, int idx, String newString) {
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		//  choose to be
		char currChar = str.charAt(idx);
		subSequences(str, idx+1 ,newString + currChar);

		//not choose not to be
		subSequences(str, idx+1 ,newString);
	}
	public static void main(String[] args) {
		String str = "abc";
		subSequences(str, 0 ,"");
	}
}