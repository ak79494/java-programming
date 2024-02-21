class Address1 {
	String city;
	String state;
	int pin;
	Address1(String city,String state, int pin) {
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public void displayAddress() {
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Pin: "+pin);
	}
}