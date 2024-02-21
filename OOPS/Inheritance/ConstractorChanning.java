class Base {
	String name;
	Base(){ // contractor 1
		System.out.println("base()initialize");
	}
	Base(String name){
		this.name = name;
	}
	
		}
		class Derived extends Base {
		Derived(String name){
			super();
			System.out.println("Calling parameterised constractor derived");
	}
}
class ConstractorChanning {
	public static void main(String[] args) {
		Derived derived = new Derived("test");
	}
}