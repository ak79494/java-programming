import java.util.*;
class RevisionString {
	public static void main(String[] args) {
		// reverse

		// String name = "ellyse alexandra perry";
		// char[] arr = name.toCharArray();
		// for(int i=arr.length-1; i>=0; i--) {
		// 	System.out.print(arr[i]+" ");
		// }


		// String Character

		// int i, length, count[] = new int[256];
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter String");
		// String name = sc.nextLine();

		// length=name.length();
		// for(i=0; i<length; i++) {
		// 	count[(int) name.charAt(i)]++;

		// }
		// for(i=0; i<256; i++) {
		// 	if(count[i] != 0) {
		// 		System.out.print((char) i +" "+count[i]);
		// 	}
		// }

		//// String Capital

		// String name = "ellyse alexandra perry";
		// char[] arr = name.toCharArray();
		// for(int i=0; i<arr.length; i++) {
		// 	if(i==0 || arr[i-1]==' ' && arr[i] != ' ') {
		// 		if(arr[i]>=97 && arr[i]<=122)
		// 			arr[i] = (char) (arr[i]-32);

		// 	}else if(arr[i]>=65 && arr[i]<=90)
		// 	arr[i] = (char) (arr[i]+32);
		// 	name = name + arr[i];
		// }
		// System.out.println(arr);

		// Duplicate

		// String name = "ellyse alexandra perry";
		// int num = 0;
		// char[] arr = name.toCharArray();
		// for(int i=0;i<arr.length; i++) {
		// 	for(j=i+1; j<arr.length; i++) {
		// 		if(arr[i] == arr[j]) {
		// 			System.out.println(arr[i]);
		// 			num++;
		// 			break;


		// 		}
		// 	}
		// }

		// String Accending

		String name = "ellyse alexandra perry";
		char[] arr = name.toCharArray();
		 Arrays.sort(arr);
		 name = new String(arr);
		 System.out.println(name);
	}
}