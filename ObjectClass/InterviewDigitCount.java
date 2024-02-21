import java.util.Scanner;
class InterviewDigitCount {
	public static void main(String[] args) {
		int i, length,count[] = new int[256];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Vlue");
		String name = sc.nextLine();
		length = name.length();
		for(i=0; i<length;i++) {
			count[(int) name.charAt(i)]++;

		}
		for(i=0; i<256; i++) {
			if(count[i]!=0) {
				System.out.println((char) i +" "+count[i]);
			}
		}
	}
}