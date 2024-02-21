class ShradhaKhapra1 {
	int eye;
	int legs;
	String sex;
	ShradhaKhapra1() {
		eye = 2;
		legs = 2;
		sex  = "Female";
		
	}
	public void printInfo() {
		System.out.println("non parameterised");
		System.out.println(this.eye);
		System.out.println(this.legs);
		System.out.println(this.sex);

	}
	public static void main(String[] args) {
		ShradhaKhapra1 shradha = new ShradhaKhapra1();
		shradha.printInfo();
	}
}