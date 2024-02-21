class fullLeftRight {
	public static void main(String[] args) {
		int n = 5;
		int m = 2;
		int spaces = 3;
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=m; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2) {
				m++;
			}else{
				m--;
			}
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=m; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2) {
				m++;
				spaces--;
			}else{
				m--;
				spaces++;
			}
		}
	}
	
}