class PatternF {
	public static void main(String[] args) {
		for(int i=0; i<=9; i++) {
			for(int j=0; j<=10; j++) {
				if(i==0 || i==1 || j==0 || j==1 || i==5 || i==6) {
					System.out.print("F");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}