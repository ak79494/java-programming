import java.lang.Object;
class Student {
	String name = "Aman";
}
class ObjectArray00 {
	public static void main(String[] args) {
		Object[] obj = new Object[4];
		obj[0] = Integer.valueOf(5);
		obj[1] = Double.valueOf(7.5);
		obj[2] = Character.valueOf('A');
		obj[3] = Boolean.valueOf(true);
		
		for(Object o : obj) {
			System.out.println(o);	
		}
	}
}