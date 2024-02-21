class ShradhaKhapra {
	int eye;
	int legs;
	String sex;
	public void display() {
		System.out.println(this.eye);
		System.out.println(this.legs);
		System.out.println(this.sex);

		System.out.println("default constractor");
	}
	public static void main(String[] args) {
		ShradhaKhapra shradha = new ShradhaKhapra();
		shradha.display();
	}
}