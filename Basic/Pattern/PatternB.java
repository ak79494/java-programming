class PatternB {
	public static void main(String[] args) {
		for(int i=0; i<=11; i++) {
			for(int j=0; j<=2; j++) {
				System.out.printf("*");
			}
			for(int k=1;k<=5;k++) {
				if(i>=0 && i<2 || i>4 && i<7 || i>9 && i<=11) {
					System.out.printf("**");
				}else{
					System.out.printf("  ");
				}
			}
			for(int j=0;j<=2;j++) {
				if(i>=0 && i<2 || i>4 && i<7 ||i>9 && i<=11) {
					System.out.printf(" ");
				}else{
					System.out.printf("*");
				}
			}
			System.out.println();
		}
	}
}

