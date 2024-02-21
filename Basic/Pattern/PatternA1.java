class PatternA1 {
	public static void main(String[] args) {
		int n = 5;
	    int m = 5;
        for(int i=1; i<=n; i++) {
        	for(int j=1; j<=n; j++) {
                if(i==1 || j==m || j==1 || i==3) {
                    System.out.print("*");
                }else{
                	System.out.print(" ");
                }
        	}
        	System.out.println();
        }

	}			
}

 // ******
//  *    *
//  ******
//  *    *
//  *    *