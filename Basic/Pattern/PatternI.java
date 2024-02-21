class PatternI {
	public static void main(String[] args) {
		for(int i=0; i<=7; i++) {
			for(int j=0; j<=7; j++) {
				if(i==0 || i==7 || j==5) {
					System.out.print(" II");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}