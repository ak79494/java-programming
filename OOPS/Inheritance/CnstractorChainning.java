class Animal {
	Animal(){
		this(5);
		System.out.println("a() initialised");
	}
	Animal(int x){
		this(5,15);
		System.out.println(x);
	}
	Animal(int x, int y){
		System.out.println(x*y);
	}
}
class CnstractorChainning{
	public static void main(String[] args) {
		Animal ani = new Animal();

	}
}