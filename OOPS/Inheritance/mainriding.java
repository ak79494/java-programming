class Horse {
	private void eat() {
		System.out.println("Horse eat grass");
	}
	protected void home() {
		System.out.println("Horse is saty Horse house");
	}
}
class Cow extends Horse {
	private void eat1() {
		System.out.println("cow eat grass");
	}
	public void home1() {
		super.home();
		System.out.println("cow is staying on cowhouse");
	}
}
class mainriding {
	public static void main(String[] args) {
		Cow cow = new Cow();
		cow.home1();
		
		Horse hor = new Horse();
		hor.home();
		
	}
}