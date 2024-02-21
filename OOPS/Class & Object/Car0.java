class Car0{
	String color;
	int model;
	Address0 address;
	Car0(String color, int model, Address0 address){
		this.color = color;
		this.model = model;
		this.address = address;
	}
	void printcarDetails(){
		System.out.println("====Car details====");
		System.out.println("color: "+color);
		System.out.println("model: "+model);
		address.addressDetails();
	}
}