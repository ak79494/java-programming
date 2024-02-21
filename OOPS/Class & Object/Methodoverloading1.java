class Methodoverloading1{
	static void mul(int num, int num1){
		System.out.println(num+" * "+num+" = "+(num*num1));
	}
	static void mul(int num, int num1, int num2, int num3){
		System.out.println(num+" * "+num1+" * "+num2+" * "+num3+" = "+(num*num1*num2*num3));
	}
}