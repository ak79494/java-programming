class PatternG {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=0; j<=7; j++) {
				if(j==0 || i>=8 || i==1 || j<2 || i>7 || j<7 ) {
					System.out.print("G");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}