class AnimalDefaultConstractor {
	String name;
	int eye;
	AnimalDefaultConstractor() {

	}
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.eye);
	}
	public static void main(String[] args) {
		AnimalDefaultConstractor animal = new AnimalDefaultConstractor();
		animal.printInfo();
	}
}