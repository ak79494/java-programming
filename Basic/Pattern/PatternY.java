class PatternY {
	public static void main(String[] args) {
		for(int i=0; i<6; i++) {
	    	for(int j=0; j<6; j++) {
	    		if((i==j&&i<=2) || (i+j==5&&i<=2) || (j==3&&i>=3)) {
	    			System.out.print(" Y");
	    		}else{
	    			System.out.print("  ");
	    		}
	    	}
	    	System.out.println();
	    }
	}
}