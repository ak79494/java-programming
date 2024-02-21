class PatternR {
	public static void main(String[] args) {
		int n = 9;
		int m = n/2+1;
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=4; j++) {
				if(j==1 || i==1 || j==m) {
					System.out.print(" RR");
				}else{
					System.out.print(" ");
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