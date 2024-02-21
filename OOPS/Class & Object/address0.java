class Address0{
	String city;
	String state;
	int pin;
	Address0(String city, String state, int pin){
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	void addressDetails(){
		System.out.println("=====Address=====");
		System.out.println("City: "+city);
		System.out.println("state: "+state);
		System.out.println("pin: "+pin);
	}    
}