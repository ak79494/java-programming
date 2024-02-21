class Methodoverloading{
	static void add(int num, int num1){
		System.out.println(num+" + "+num1+" = "+(num+num1));
	}
	static void add(int num, int num1, int num2, int num3){
		System.out.println(num+" + "+num1+" + "+num2+" + "+num3+" = "+(num+num1+num2+num3));
	}
}