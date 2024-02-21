class LeftHalfPyramid {
	public static void main(String[] args) {
		int n = 3;

		for(int i=1; i<=n; i++) {
			//Space  like ist raw 3-1 = 2 space n= 3
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(); // next line print
		}
	}
}

//     *
//   * *
// * * *
