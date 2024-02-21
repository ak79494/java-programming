class leftFullButterFly {
	public static void main(String[] args) {
	//	int n = 5;
	//	int m = 1;
	//	for(int i=1; i<=n; i++) {
	//
	//		for(int j=1; j<=m; j++) {
	//
	//			System.out.print("*");
	//		}
	//		System.out.println();
	//		if(i<=n/2) {
	//			m++;
	//		}else{
	//			m--;
	//		}
	//	}
	//}
//}
//   *
//   *  *
//   *  *  *
//   *  *
//   *
        int n = 3;
        for(int i=1; i<=n; i++) {
        	for(int j=1; j<=i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        for(int i=n; i>=1; i--) {
        	for(int j=1; j<=i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}  

// *
// * *
// * *  *
// * *  *
// * *
// *      