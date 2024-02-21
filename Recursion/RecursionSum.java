class RecursionSum {// sum = 1 + 2 + 3 +4 + 5........n.
	public static void printSum(int i, int n, int sum) {
		if(i==n) {
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		printSum(i+1 ,n, sum);
		
	}
	public static void main(String[] args) {
		printSum(1,5,0);
	}
}
// Dryrun
  // i = 1 i==n - 1==5,  2==5,  3==5,  4==5, 5==5
 //  n = 5
// sum = 0 1 , 1+2 3, 3+3 6, 6+4 10, 10+5 15