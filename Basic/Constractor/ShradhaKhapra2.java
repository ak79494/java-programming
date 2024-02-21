class ShradhaKhapra2 {
	int eye;
	int legs;
	String sex;
	ShradhaKhapra2(int eye,int legs, String sex) {
		this.eye = eye;
		this.legs = legs;
		this.sex = sex;

	}
	public void printInfo() {
		System.out.println("parameterised");
		System.out.println(this.eye);
		System.out.println(this.legs);
		System.out.println(this.sex);
	}
	public static void main(String[] args) {
		 ShradhaKhapra2 shradha = new ShradhaKhapra2(2,2,"female");
		 shradha .printInfo();
	}
}