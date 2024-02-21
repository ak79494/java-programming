class AnimalParametersied {
	String color;
	int legs;
	int eye;
	AnimalParametersied (String color,int legs,int eye) {
		this.color = color;
		this.legs = legs;
		this.eye = eye;
	}
	public void printInfo() {
		System.out.println("Horse color "+this.color);
		System.out.println("legs "+this.legs);
		System.out.println("eye "+this.eye );
	}
	public static void main(String[] args) {
		AnimalParametersied animal = new AnimalParametersied("black", 4,2);
		 animal.printInfo();
	}
}