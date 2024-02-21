class Girl { // user defined
	String name = "Shradha";
	int age = 24;

	public String toString() {
		return "name: "+name+", age: "+age;
	}	
}
class Boy {
	String name = "Aman";
	int age = 26;

	public String toString() {
		return "name: "+name+", age: "+age;
	}
}
class ObjectTypeArray {
	public static void main(String[] args) {
		String name = "Arun";
		int age = 24;
		Object a1[] = {name,age};
		System.out.println("Display Array: ");
		for(Object array : a1) {
			System.out.println(array);

			Girl girl = new Girl();
			Boy boy = new Boy();

			Object[] a2 = {girl,boy};
			for(Object array1 : a2) {
				System.out.println(array1);
			}
		}
	}
}