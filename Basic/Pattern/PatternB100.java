class PatternB100{
	public static void main(String[] args) {
		int n = 9;
		int m = 11;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=m; j++) {
				if(j==0 || j==m || i==0 || i==n|| i==1||i==7|| i==4 || i==5 ||  i>9 && i<=9) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<=2;j++) {
				if(i>=0 && i<2 || i>4 && i<7 ||i>9 && i<=11) {
					System.out.printf(" ");
				}else{
					System.out.printf("*");
				}
			}
			System.out.println();
		}
	}
} 
//   * * * * * *
//   * * * * * * *
//   * *       * *
//   * * * * * * *
//   * * * * * *
//   * *       * *
//   * * *  *  * *
//   * * * * I *
//