class ButterFy {
	public static void main(String[] args) {
		int n = 3;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				int sum = i+j;
				if(sum%2==0) {
					System.out.print("1 ");
				}else{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
      
//           *
//         * * *
//       * * * * *