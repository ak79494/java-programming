class Building {
	int floor = 5;
	String address = "dhanbad";

	void liftfeature() {
		System.out.println("you can get the lift feature");
	}
	void acfeature() {
		System.out.println("you can get the ac feature");
	}
}
class Mainclass { // object will be created
	public static void main(String[] args) {
		Building b = new Building();
		// getting information
		System.out.println("no of floor: "+b.floor);
		System.out.println("address of the building: "+b.address);
		//getting feature
		b.liftfeature();
		b.acfeature();
	}
}