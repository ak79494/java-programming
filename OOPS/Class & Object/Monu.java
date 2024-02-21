class Monu{ // caller
	public static void main(String[] args) {
		Sonu.tellmeGirlName();
		long phone = Sonu.getGirlNumber();
		System.out.println("Monu received a phone numver "+phone);
		long[] phones = Sonu.getGirlsNumber();
		System.out.println("monu received all  the girls number");
		for(int i=0; i<phones.length; i++){
			System.out.println("Now sonu dialing number one by one "+phones[i]);
		}
		Girl g = Sonu.getGirlAddress();
		System.out.println("Monu receved Shradha address");
		System.out.println("Girl name :"+g.name);
		System.out.println("Girl Address : "+g.address);
		System.out.println("Girl age : "+g.age);
		System.out.println("Girl phone numner : "+g.phone);
	}
}
