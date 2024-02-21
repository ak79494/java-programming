class HasRelationship {
	public static void main(String[] args) {
		Address1 address = new Address1("Dhanbad", "Jharkhand", 828109);
		Car1 car = new Car1("Blue", 2023, address);
		car.carDetails();
		 Engine1 engine = new Engine1("Thar", 2000000, address);
		 engine.engineDetails();
	}
}