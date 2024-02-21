class ABC{ // explict calling
	int i;
	ABC(int i){
		System.out.println("A() execytrd and initialised non statoc property");
		this.i = i;
	}
}
class DEF extends ABC {
	DEF(){
		super(50);
		System.out.println("No pass the argument");
	}
}
class Channing02 {
	public static void main(String[] args) {
		DEF def = new DEF();
		System.out.println(def.i);
	}
}