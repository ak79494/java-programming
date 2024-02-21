class Thskeyword{
	int i;
	Thskeyword(){
		System.out.println("inside thskeyword");
		System.out.println("this: "+this);
	}
	void printInfo(){
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		Thskeyword r = new Thskeyword();
		r.printInfo();
	}
}