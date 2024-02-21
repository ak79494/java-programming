class PatternM {
	public static void main(String[] args) {
	    for(int i=0; i<6; i++) {
	    	for(int j=0; j<6; j++) {
	    		if(j==0 || j==5 || (i==j&&i<=2) || (i+j == 5&&i<=2)) {
	    			System.out.print(" MM");
	    		}else{
	    			System.out.print("   ");
	    		}
	    	}
	    	System.out.println();
	    }
	}
}

//  *       *
//  * *  *  *
//  *   *   *
//  *       *
//  *       *
//  *       *