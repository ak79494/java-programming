class PatternD {
	public static void main(String[] args) {
		for(int i=0; i<=6;i++) {
			for(int j=0; j<=10;j++) {
				if(i==0 || i==1 ||j==9 || j==10 ||j==3 || i==6|| i==5) {
					System.out.print("D");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}