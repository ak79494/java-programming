class Rape{
	int i;
	void m(){
		System.out.println("inside m()");
		System.out.println("this: "+this);
	}
}
class TestRape{
	public static void main(String[] args) {
		System.out.println("inside main");
		Rape r = new Rape();
		r.m();
		
	}
}