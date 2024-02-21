class PatternQ {
	public static void main(String[] args) {
		int n = 5;
		int m = 5;
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=m; j++) {
				if(i==0 ||i==1 || i==4 || j==0 || j==1 || j==4 || i==n || j==m || i==j+3) {
					System.out.print(" O");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}