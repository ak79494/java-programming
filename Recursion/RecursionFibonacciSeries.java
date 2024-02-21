class FibonacciSeries {//  print 0 1 1 2 3 5 8
	public static void printFib(int a, int b, int n) {
		if(n==0) {
			return;
		}
		int c = a + b;
		System.out.println(c);
		printFib(b,c,n-1);
	}
	public static void main(String[] args) {
		int a = 0; 
		int b = 1;
		System.out.println(a);	
		System.out.println(b);
		int n = 7;//    a0 b1 c1 d2 e3 f5 g8
		          //    7  6  5 4  3  2  1   0
		printFib(a, b, n-2);
	}
}