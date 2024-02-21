class PatternE {
	public static void main(String[] args) {
		for(int i=0; i<=11; i++) {
			for(int j=0; j<=11; j++) {
				if(i==0 || i==1 || j==0 || j==1 || i==6 || i==5 || i==10 || i==11) {
					System.out.print("E");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}