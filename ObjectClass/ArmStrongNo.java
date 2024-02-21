class ArmStrongNo {
	public static void main(String[] args) {
		int n, rem, c, arm = 0;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Value");
			n = sc.nextInt();
			c=n;
			while(n>0) {
				rem = n%10;
				arm = (rem*rem*rem)+arm;
				n = n/10;
			}
			if(c==arm) {
				System.out.println("arm Strong");
		}else{
			System.out.println("Not arm Strong");
		}
	}
}