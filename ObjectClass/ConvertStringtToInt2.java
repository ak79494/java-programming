class ConvertStringtToInt2 {
	public static void main(String[] args) {
		int age = Integer.parseInt("24");
		System.out.println(age);

		String name = "Arun";
		int val;

		try{
			val = Integer.parseInt(name);
			System.out.println(name);
			System.out.println(val);
		}catch(NumberFormatException e) {
			val = 0;
			System.out.println("String value; "+name);
			System.out.println("Integer value: "+val);
		}
	}
}