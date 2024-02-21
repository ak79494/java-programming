class ButterFly1 {
	public static void main(String[] args) {
		int n = 3;
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

//         1 2 3 4 5
//            1 2
//             1