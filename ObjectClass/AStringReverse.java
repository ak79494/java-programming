import java.util.Arrays;
import java.util.*;
class AStringReverse { 
	public static void main(String[] args) {
		// String Reverse
		// String name = "Shradha";
		// char[] arr = name.toCharArray();
		// for(int i=arr.length-1; i>=0; i--) {
		// 	System.out.print(arr[i]+" ");
			
		// }


		// String Accending

		// String name = "shradha";
		// char[] arr = name.toCharArray();
		//  Arrays.sort(arr);
		//  name = new String(arr);
		//  System.out.println(name);


		//String capital

		// String name = "Shradha"; // shradha
		// char[] arr = name.toCharArray();
		// for(int i=0; i<arr.length; i++) {
		// 	if(i==0) {
		// 		arr[i]+=32;
		// 		System.out.print(arr[i]);
		// 	}else{
			
		// 		System.out.print(arr[i]);
		// 	}
			
			
		// }

		// String Capital

		// String name = "Rasa Is a Beautiful Bollywood Actress";
		// char[] arr = name.toCharArray();
		// name=" ";

		// for(int i=0; i<arr.length; i++) {
		// 	if(i==0 || arr[i-1]==' ' && arr[i]!=' ') {
		// 		if(arr[i]>=65 && arr[i]<=90)
		// 			arr[i] = (char) (arr[i]+32);
		// 	}else if(arr[i]>=97 && arr[i]<=122)
		// 	arr[i] = (char) (arr[i]-32);
		// 	name=name+arr[i];
		// }

		// System.out.println(arr);

		// String capital

		// String name = "Rasa Is a Beautiful Bollywood Actress";
		//  char[] arr = name.toCharArray();

		//  for(int i=0; i<arr.length-1; i++) {
		//  	if(arr[i]>=65 && arr[i]<=90) {
		//  		arr[i] = (char) (arr[i]+32);
		//  	}else if(arr[i]>=97 && arr[i]<=122) {
		//  		arr[i] = (char) (arr[i]-32);
		//  	}
		//  }
		//  for(int i=0; i<arr.length; i++) {
		//  	System.out.print(arr[i]);
		//  }

		// count
		// String name = "ShradhaKhapra";
		// char[] arr = name.toCharArray();
		// int n = arr.length;
		// for(int i=0; i<n; i++) {
		// 	int count = 1;
		// 	for(int j=i+1; j<n; j++) {
		// 		if(arr[i]==arr[j]) {
		// 			count++;
		// 		    int k=j;
        //           while(k<n-1) {
        //           	arr[k] = arr[k+1];
		// 			k++;
        //           }
        //           j--;
		// 		  n--;

		// 		}
					
		// 	}
		// 	System.out.println(arr[i]+"-->"+count);
		// }

		// count Character

		// int i, length,count[] = new int[256];
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter String value");
		// String name = sc.nextLine();
		// length = name.length();
		// for(i=0; i<length; i++) {
		// 	count[(int) name.charAt(i)]++;

		// }
		// for(i=0; i<256; i++) {
		// 	if(count[i] != 0) {
		// 		System.out.println((char) i +" "+count[i]);
		// 	}
		// }

		//Duplicate

		// String name = "Shradha khapra";
		// int num = 0;
		// char[] arr = name.toCharArray();
		// for(int i=0; i<arr.length; i++) {
		// 	for(int j=i+1; j<arr.length; j++) {
		// 		if(arr[i]==arr[j]) {
		// 			System.out.print(arr[i]);
		// 			num++;
		// 			break;
		// 		}
		// 	}
		// }

		// Split Reverse

		// String name = "Shradha Khapra";
		// String[] arr = name.split(" ");
		// for(int i=arr.length-1; i>=0; i--) {
		// 	System.out.print(arr[i]+" ");
		// }
		// System.out.println();


		// Split Reverse

		String name = "Ellyse Perry Beautiful Cricketer";
		String[] arr = name.split(" ");
		String reversename = " ";
		for(String array : arr) {
			String reversearr = " ";
			for(int i=array.length()-1; i>=0; i--) {
				reversearr = reversearr + array.charAt(i);
			}
			reversename = reversename + reversearr +"";
		}
		System.out.println(reversename);


	}
}