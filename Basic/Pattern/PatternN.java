class PatternN {
	public static void main(String[] args) {
		int n = 9;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(j==1 || j==8 || i==j) {
					System.out.print(" NN");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}