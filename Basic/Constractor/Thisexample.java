class Animal{
	String name;
	int leg;
	Animal(){ // constractor
		name = "cow";
		leg = 4;
	}
	public void printinfo(){
		System.out.println(this.name);
		System.out.println(this.leg);
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.printinfo();
	}
}