class PerfectNumber {       
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in) {
			System.out.println("Enter value");
			n = sc.nextInt();

			for(int i=1; i<n; i++) {
				if(n%i == 0) {
					sum = sum + i;
				}
			}
			if(n==sum) { 
				System.out.println("perfect number");
			}else{
				System.out.println("not perfect number");
			}
		}
	}
}