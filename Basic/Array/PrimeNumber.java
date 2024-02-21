import java.util.*;
class PrimeNumber {
	public static void main(String[] args) {
		int n, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int x = sc.nextInt();
		for(int i=1; i<=x; i++) {
			if(x%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}else{
			System.out.println("not prime");
		}
	}
}