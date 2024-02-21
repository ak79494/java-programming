class Abc{
	int a;
	Abc(int a){
		System.out.println("A() executed and pass the argument");
		this.a = a;
	}
}
class Def extends Abc {
	int b;
	Def(int b){
		super(22);
		System.out.println("pass the argument");
		this.b = b;
	}
}
class Cde extends Def {
	Cde(){
		super(24);
		System.out.println("Cde () executed and pass the non static property");
	}
}
class GHI {
	public static void main(String[] args) {
	    Cde g1 = new Cde();
	    System.out.println(g1.a);
	    System.out.println(g1.b);
    }
}