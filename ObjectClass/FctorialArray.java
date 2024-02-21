class FctorialArray { // 5! = 5 *4 *3 * 2 * 1 = 120; n-1
	public static int calcFactorial(int n) {
		if(n==0||n==1{
			return 1;
		}
		int fact_nm1 = calcFactorial(n-1);
		int fact_n = n * fact_nm1;
		return fact_n;
	}

	public static void main(String[] args) {
		int n = 5;
		int ans = calcFactorial(n);
		System.out.println(ans);
	}
}