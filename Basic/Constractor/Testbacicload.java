class Basic {
	static void add(int num, int num1) {
		System.out.println(num+" + "+num1+" = "+(num+num1));		
		}
		static void add(int num, int num1,int num2){
			System.out.println(num+" + "+num1+" + "+num2+" = "+(num+num1+num2));
	}
}
class Testbacicload {
	public static void main(String[] args) {
		Basic.add(22,24);
		Basic.add(22,24,24);
	}
}