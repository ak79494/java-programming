class AnimalNonParametersied {
	String color;
	int legs;
	int eye;
	 AnimalNonParametersied() {
	 	color = "black";
	 	legs = 4;
	 	eye = 2;
	}
	public void printInfo() {
		System.out.println("horse color "+this.color);
		System.out.println("legs "+this.legs);
		System.out.println("eye "+this.eye);
	}
	public static void main(String[] args) {
		AnimalNonParametersied animal = new AnimalNonParametersied();
		animal.printInfo();
	}
}