class Test{
	int i;
	void m(){
		System.out.println("executed");
		i=10;
		System.out.println("i: "+i);
		System.out.println(this.i);
	}
}
class Demotest{
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("inside main");
		System.out.println("t.i: "+t.i);
		t.m();
	}
}