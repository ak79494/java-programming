class Raid{
	int i;
	void m(){
		System.out.println("inside m()");
	System.out.println("this: "+this);
	}
}
class Testraid{
	public static void main(String[] args) {
		System.out.println("inside main");
		Raid r = new Raid();
		r.m();
	}
}