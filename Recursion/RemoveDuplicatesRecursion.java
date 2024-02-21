class RemoveDuplicatesRecursion { // "abbccda" = "abcd";
	public static boolean[] map = new boolean[26];
	public static void removeDuolicates(String str,int idx ,String newString) {
		if(idx==str.length()) {
			System.out.println(newString);
			return;
		}
		char currChar = str.charAt(idx);
		if(map[currChar-'a']) {
			removeDuolicates(str,idx+1,newString);
		}else{
			newString += currChar;
			map[currChar-'a'] = true;
			 removeDuolicates(str,idx+1,newString);
		}

	}
	public static void main(String[] args) {
		String str = "abbccda";
		removeDuolicates(str,0,"");
	}
}