class StringDuplicate00 {
	public static void main(String[] args) {
		String[] names = {"Arun","Mukesh","Arun","Mukesh","payal","Shekhar"};
		for(int i=0; i<names.length-1; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j]) && j!=0) {
					System.out.println("Duplicate: "+names[i]);
				}
			}
			
		}
	}
}