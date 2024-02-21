class Rvariable{
	static int i;
	static void m(int i){
		System.out.println("m() executed");
		System.out.println(i);
		System.out.println(Rvariable.i);
	}
}
class Testvariable{
	public static void main(String[] args) {
		Rvariable.m(24);
	}
}