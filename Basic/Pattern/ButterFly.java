class ButterFly {
	public static void main(String[] args) {
		int n = 3;
		int m = 1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=m; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			m+=2;
		}
	}
}

//     1
//   2 2 2
// 3 3 3 3 3
