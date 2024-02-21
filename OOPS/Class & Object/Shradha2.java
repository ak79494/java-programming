class Customer{
	String name;
	String address;
	long accountnumber;
	String ifsccode;
	int age;
}
class Shradha2{
	static String getCustomerName(){
		System.out.println("Customer name is yastika");
		return "Yastika";
	}
	static long getCustomerAccount(){
		System.out.println("Shradha can give the account number to bank");
		return 2132132132L;	
	}
	static String getIfscCodeBank(){
		System.out.println("Shradha can give the the Ifsc code to bank");
		return "ICIC00213";	
	}
	static long getPhoneNumber(){
		System.out.println("Shradha can give the account holder number for kyc");
		return 1112221112L;
	}
	static  Customer accountDetails(){
		System.out.println("Shradha can give the bank to account details");
		Customer c = new Customer();
		c.name = "Yastika Bhatia";
		c.address = "mumbai";
		c.accountnumber = 2221112211L;
		c.ifsccode = "ICIC111222";
		c.age = 24;
		return c;
	}
}