class Engine1 {
	String brand;
	int price;
	Address1 address; 
	Engine1(String brand, int price, Address1 address) {
		this.brand = brand;
		this.price = price;
		this.address = address;
	}
	public void engineDetails() {
		System.out.println("Engine: "+brand);
		System.out.println("Price: "+price);
		address.displayAddress();
	}
}