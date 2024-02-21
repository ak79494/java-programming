class Stringletter1 {
	public static void main(String[] args) {
		//String name = "Azam Amir Reza"; //output =  ""Reza Amir Azam"
		//String[] arr = name.split(" ");
		//String namereverse = " ";
		//for(int i=arr.length-1; i>=0; i--) {
		//	namereverse = namereverse + arr[i]+" ";	
		//}
		//System.out.println("Brefore String: "+name);
		//System.out.print("After String: "+namereverse);

		String name = "Nora actress indian hot fathei"; // fathei Nora
		String[] arr = name.split(" ");
		for(int i=arr.length-1; i>=0; i--) { 
		  System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}