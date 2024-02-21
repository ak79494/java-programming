class PatternA {
	public static void main(String[] args) {
		int n = 5;
		int m = 5;
		for(int i=n;i>=1; i--) {
			for(int j=0; j<=m; j++) {
				if((i==0)||(i==n||j==m)||(i==3)) {
					System.out.print("A");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}

//  ******
//  *    *
//  ******
//  *    *
//  *    *
