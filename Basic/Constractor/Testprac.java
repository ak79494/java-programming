class Prac{
	int i;
	Prac(){
		System.out.println("inside prac");
		System.out.println("this: "+this);
	}
	void m(){
		System.out.println("inside m()");
		System.out.println("this: "+this);
	}
}
class Testprac{
	public static void main(String[] args) {
		Prac p = new Prac();
		System.out.println("inside main");
		System.out.println("p: "+p);
		p.m();
		
	}
}