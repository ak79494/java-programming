class Pattern7 {
	public static void main(String[] args) {
		int n = 5;
		int m = 5;
		 
		for(int i=n; i>=1; i--) {
			for(int j=0; j<=n; j++) {
				if((i==0||j==0)||(i==n||j==m)||(i==3)) {
					System.out.print( "*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=n; i>=1; i--) {
			for(int j=0; j<=n; j++) {
				if((i==0||j==0)||(i==n||j==m)||(i==3)||(i+j==n+1)) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=n; i>=1; i--) {
			for(int j=0; j<=n; j++) {
				if((i==0||j==0)||(j==m)||(i==1)) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=n; i>=1; i--) {
			for(int j=0; j<=n; j++) {
				if((i+j==n+1)||(i==0||j==0)||(j==m)) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}