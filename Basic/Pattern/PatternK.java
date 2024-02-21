class PatternK {
	public static void main(String[] args) {
		int n = 12;
		int m = n/2+1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(j==1 || j==m) {
					System.out.print(" KK");
				}else{
					System.out.print("   ");
				}	
			}
			if(i<=n/2) {
				m--;
			}else{
				m++;
			}
			System.out.println();	
		}	
	}
}