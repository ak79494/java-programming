class Bank2{
	public static void main(String[] args) {
		 String name = Shradha2.getCustomerName();
		 System.out.println();
		 long account = Shradha2.getCustomerAccount();
		 System.out.println("Account number of customer: "+account);
		 String code = Shradha2.getIfscCodeBank();
		 System.out.println("Bank Ifsc code: "+code);
		 long phone = Shradha2.getPhoneNumber();
		 System.out.println("Customer phone number: "+phone);
		 Customer c = Shradha2.accountDetails();
		 System.out.println("customer name: "+c.name);
		 System.out.println("Customer address: "+c.address);
		 System.out.println("Customer account number: "+c.accountnumber);
		 System.out.println("bank Ifsc code: "+c.ifsccode);
		 System.out.println("Customer age: "+c.age);
	}
}