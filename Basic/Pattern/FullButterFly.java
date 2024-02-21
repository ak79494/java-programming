class FullButterFly {
	public static void main(String[] args) {
		int n = 5;
		int m = 5;
		int spaces = 0;
		// row
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			// col
			for(int j=1; j<=m; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2) {
				m-=2;
				spaces++;
			}else{
				m+=2;
				spaces--;
			}
		}
	}
}