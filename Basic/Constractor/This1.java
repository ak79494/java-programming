class This1{
	int i;
	This1(){
		System.out.println("inside this1()");
		System.out.println(this.i);
	}
	void m(){
		System.out.println("inside m()");
		System.out.println("this: "+this);
	}
}
class Thistest{
	public static void main(String[] args) {
		This1 t = new This1();
		System.out.println("inside main");
		System.out.println("t: "+t);
		t.m();
	}
}