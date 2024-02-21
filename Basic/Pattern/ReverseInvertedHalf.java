class ReverseInvertedHalf {
	public static void main(String[] args) {
		int str = 3;
		int spc = 0;
		for(int i=str; i>=1; i--) {
			for(int j=1; j<=spc; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			str--;
			spc++;
		}

	}
}

//* * *
//  * *
//    *