class Battery {
	String brand;
	int guarantee;
	Mobile mobile;
	Battery(String brand,int guarantee, Mobile mobile) {
		this.brand = brand;
		this.guarantee = guarantee;
		this.mobile = mobile;
	}
	public void batteryDeatail() {
		System.out.println("=========battery detail=========");
		System.out.println("brand: "+brand);
		System.out.println("Guarantee: "+guarantee);
		mobile.mobileDetail();
	}
}