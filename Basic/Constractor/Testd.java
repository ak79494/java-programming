class Demothis{
	int i;
	Demothis(){
		System.out.println("inside Demo()");
		System.out.println("this: "+this);
	}
	void printinfo(){
		System.out.println(this.i);
	}
}
class Testd{
	public static void main(String[] args) {
		Demothis d = new Demothis();
		d.printinfo();
		
	}
}