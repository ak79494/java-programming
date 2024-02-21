import java.util.*;
class Prime{
	public static void main(String[] args) {
		int n, count = 0;
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1;i<=x;i++){
			if(x%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("Prime");
		}else{
			System.out.println("Not prime");
		}
	}
}