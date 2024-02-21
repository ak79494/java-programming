class Bank{
	int deposit;
	int withdrawl;
	void display() {
		System.out.println("Display shradha the account balance");
	}
}
class Icici extends Bank {
	String accountType;
	void dispaly2() {
		System.out.println("Dispaly the accountType");
	}
}
class Axis extends Bank {
	void type() {
		System.out.print("Types of account are axis bank opening");
	}
} 
class UpDownCastRevision {
	public static void main(String[] args) {
		Bank bank = new Icici();
		//upcasting
		bank.display();
		bank.deposit = 50000;
		bank.withdrawl = 20000;
		System.out.println("Shradha deposit :"+bank.deposit);
		System.out.println("Shradha Withdrawl : "+bank.withdrawl);
		

		//downcasting
		Icici icici = (Icici)bank;
		icici.dispaly2();
		icici.accountType = "Saving";
		System.out.println("icici bank account type : "+icici.accountType);

		Bank bank2 = new Axis();
		bank.display();

		Axis axis = (Axis)bank2;
		axis.type();

	}
}