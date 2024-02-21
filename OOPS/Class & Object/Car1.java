class Car1 {
	String color;
	int modelNumber;
	Address1 address;
	Car1(String color, int modelNumber,Address1 address) {
		this.color = color;
		this.modelNumber = modelNumber;
		this.address = address;

	}
	public void carDetails() {
		System.out.println("color: "+color);
		System.out.println("Module number: "+ modelNumber);
		System.out.println("Address: "+address);
		address.displayAddress();
	}
}