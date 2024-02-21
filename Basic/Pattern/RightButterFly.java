class RightButterFly {
	public static void main(String[] args) {
		int n = 5;
		int m = 1;
		int spc = 2;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=spc; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=m; j++) {
				System.out.print("*");
                }
                System.out.println();
				if( i<=n/2) {
					m++;
					spc--;
				}else{
					m--;
					spc++;
			}
		}
	}
}
 
//        *
//     *  *
//  *  *  *
//     *  *
//        *