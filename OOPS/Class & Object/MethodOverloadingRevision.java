class MethodOverloadingRevision {
	public static void add(int num1, int num2) {
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
	public static void add(int num1, int num2, int num3) {
		System.out.println(num1+" + "+num2+" + "+num3+" = "+(num1+num2+num3));
	}
}