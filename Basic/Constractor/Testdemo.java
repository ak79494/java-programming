class Demothis{
	int i;
	Demothis(){
		System.out.println("inside Demo()");
		System.out.println("this: "+this);
	}
	void m(){
		System.out.println("inside m()");
		System.out.println("this: "+this);
	}
}
class Testdemo{
	public static void main(String[] args) {
		Demothis demo = new Demothis();
		System.out.println("inside main");
		System.out.println("demo:"+demo);
		demo.m();
		
	}
}
// this example