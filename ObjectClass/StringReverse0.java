import java.util.*;
class StringReverse0 {
	public static void main(String[] args) {
		//String name = "Arun Goswami";
		//char[] arr = name.toCharArray();
//================================++================================== 
		//reverse 1
		//for(int i=arr.length-1;i>=0;i--) {
		//	System.out.print(arr[i]);
		//}
//================================++================================== 
		// accending sort 2
		//Arrays.sort(arr);
		//name = new String(arr);
		//System.out.println(name);
//=================================++================================= 
		// convert capital small 3
		//System.out.print("Original name: "+name);
		//System.out.println();
		//System.out.print("Convert name: ");
		//for(int i=0; i<arr.length; i++) {
		//	arr[i]-=32;
		//	System.out.print(arr[i]);
		//}
//==================================++================================= 
		// Arun goswami reverse both output nurA imawsog 4
			//String[] arr = name.split(" ");
		//	String namereverse = " ";
		//	for(String array : arr) {
		//		String reversearr = " ";
		//		for(int i=array.length()-1; i>=0; i--) {
		//			reversearr = reversearr + array.charAt(i);
		//		}
		//		namereverse = namereverse + reversearr +" ";
		//	}
		//	System.out.println(namereverse);
//====================================++================================
					// modify Arun = aRUN 5

		//arr[0] = 'a';
		//arr[0] = 'R';
		//arr[0] = 'U';
		//arr[0] = 'N';
		//name = new String(arr);
		//System.out.println(name);
//=====================================++=================================
		//	"Azam Amir Reza" == Reza Amir Azam output
		//String name = "Azam Amir Reza";
		//String[] arr = name.split(" ");
		//String namereverse = " ";
		//for(int i=arr.length-1; i>=0; i--) {
		//	namereverse = namereverse + arr[i]+" ";
		//}
		//System.out.println("Before String: "+name);
		//System.out.println("After String: "+namereverse);
//=======================================++=================================
		// arun find character a=1, r=1, u=1,n=1
	  int i, length, count[] = new int[256];
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  System.out.println("Enter String");
	  length  = str.length();
	  for(i=0; i<length; i++) {
	  	count[(int) str.charAt(i)]++;
	  }
	  for(i=0; i<256; i++) {
	  	if(count[i] != 0) {
	  		System.out.println((char) i + " "+ count[i]);
	  	}
	  }
	}
}