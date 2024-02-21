class Address{
	String city;
	int pin;
	String state;
	Address(String city, int pin, String state){
		this.city = city;
		this.pin = pin;
		this.state = state;
	}
	void printDetails(){
		System.out.println("=====Address=====");
		System.out.println("City: "+city);
		System.out.println("Pin: "+pin);
		System.out.println("state: "+state);
	}
}