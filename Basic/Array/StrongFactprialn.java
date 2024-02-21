import java.util.*;
class StrongFactprialn{
	public static void main(String[] args) {
		int n,c, rem, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		n = sc.nextInt();
		c=n;
		while(n>0) {
			rem = n%10;
			int fact = 1;
			for(int i=1; i<=rem; i++) {
				fact = fact*i;
			}
			n= n/10;
			sum = sum + fact;
		}
		if(c==sum) {
			System.out.println("Strong");
		}else{
			System.out.println("Not strong");
		}

	}
}