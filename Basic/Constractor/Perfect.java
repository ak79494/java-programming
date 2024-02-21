import java.util.*;
class Perfect{
	public static void main(String[] args) {
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<n;i++){
			if(n%i==0){
			sum =  sum+i;	
			}
		}
		if(n==sum){
			System.out.println("Perfect");
		}else{
			System.out.println("Not perfect");
		}
	}
}