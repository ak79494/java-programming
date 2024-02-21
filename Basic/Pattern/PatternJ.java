class PatternJ {
	public static void main(String[] args) {
		int n=5;
		int m=3;
		for(int i=n;i>=1; i--) {
			for(int j=0; j<=m; j++) {
				if((j==m)||(i==1)||(j>2)) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
//        
//        *
//        *
//    *   *
//    *   *
//    * * *