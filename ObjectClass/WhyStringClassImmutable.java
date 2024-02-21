class WhyStringClassImmutable {
	public static void main(String[] args) {
		String name1 = "Shradha";
		String name2 = "Shradha";
		name2 = name1.concat("Aman");
		System.out.println(name1);
		System.out.println(name2);
	}
}