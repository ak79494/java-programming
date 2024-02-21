import java.util.*;
class PerfectNum {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		n = sc.nextInt();
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		if(n==sum) {
			System.out.println("perfect");
		}else{
			System.out.println("Not perfect");
		}

	}
}