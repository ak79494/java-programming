class Swastik {
	public static void main(String[] args) {
		int n = 7;
		// 7+1 = 8/2 = 4 in fourth raw raw and column stars
		int mid = (n+1)/2;
		// outer loops used for raws
		for(int i=1; i<=n; i++) {
			// inner loop used for columns printing stars
			for(int j=1; j<=n; j++) {
				//here starting main logic
				if((i==mid||j==mid)||(i==1&&j>mid)||(i==n&&j<mid)||(j==1&&i<mid)||(j==n&&i>mid)) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}