class Engine{
	int price;
	String brand;
	String color;
	Address0 address;
	Engine(int price, String brand, String color, Address0 address){
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.address = address;
	}
	void printInfo(){
		System.out.println("====engine details====");
		System.out.println("price: "+price);
		System.out.println("brand: "+brand);
		System.out.println("color: "+color);
		address.addressDetails();
	}
}