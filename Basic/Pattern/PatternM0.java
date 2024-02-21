class PatternM0 {
	public static void main(String[] args) {
		for(int i=0; i<6; i++) {
	    	for(int j=0; j<6; j++) {
	    		if(j==0 || j==5 || (i==j&&i<=2) || (i+j==4&&i<=2)){
	    			System.out.print(" M");
	    		}else{
	    			System.out.print("  ");
	    		}
	    	}
	    	System.out.println();
	    }
	}
}