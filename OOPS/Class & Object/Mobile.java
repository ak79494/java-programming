class Mobile {
	String brand;
	String type;
	Mobile(String brand,String type) {
		this.brand = brand;
		this.type = type;
	}
	public void mobileDetail() {
		System.out.println("=======Mobile detail=========");
		System.out.println("Brand: "+brand);
		System.out.println("Type: "+type);
	}
}