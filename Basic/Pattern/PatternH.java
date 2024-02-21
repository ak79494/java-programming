class PatternH {
	public static void main(String[] args) {
		for(int i=0; i<=7; i++) {
			for(int j=0; j<=7; j++) {
				if(j==0 || j==1 || j==7 || j==6 || i==3 || i==4) {
					System.out.print(" H");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}