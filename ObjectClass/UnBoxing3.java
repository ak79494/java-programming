package advanced;

public class UnBoxing3 {

	public static void main(String[] args) {
		//create object wrapper class
		arr[0] = Integer obj1 = Integer.valueOf(24);
		arr[10]Double obj2 = Double.valueOf(24.5);
		arr[20]Boolean obj3 = Boolean.valueOf(true);
		
		//convert premetive
		int j1 = obj1;
		double j2 = obj2;
		boolean j3 = obj3;
		
		// print
		System.out.println("Integer variable: "+j1);
		System.out.println("Double variable: "+j2);
		System.out.println("Boolean variable: "+j3);
		
	}

}
