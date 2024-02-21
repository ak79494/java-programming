class HasA{
	public static void main(String[] args) {
		 Address0 address = new Address0("dhanbad", "jharkhand", 828109);
		 Car0 obj = new Car0("Black", 2023, address);
		 obj.printcarDetails();
		 Engine eng = new Engine(1000000, "Thar", "black", address);
		 eng.printInfo();
	}
}