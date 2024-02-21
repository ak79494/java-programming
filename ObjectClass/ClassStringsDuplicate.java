class ClassStringsDuplicate {
	public static void main(String[] args) {
		String[] name = {"EllysePerry","Danni Wyatt","Emily Arlott","Amy Jones","Danni Wyatt","EllysePerry"};
		for(int i=0; i<name.length; i++) {
			for(int j=i+1; j<name.length; j++) {
				if(name[i].equals(name[j])&& i!=j) {
					System.out.println("Duplicate: "+name[i]);

				}
			}
			
		}
	}
}