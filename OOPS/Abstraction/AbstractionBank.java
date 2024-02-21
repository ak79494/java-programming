abstract class Bank {
	abstract void deposit();
}
class Icici extends Bank {
	void deposit() {
		System.out.println("Store in MySQL Database : icici bank can opening a account to deosit 25000");
	}
}
class Axis extends Bank {
	void deposit() {
		System.out.println("Store in Oracle Database : Axis bank can opening a account to deosit 10000");
	}
}
class Helperclass {
	static Bank getconnect(String type) {
		if(type.equals("MySQL")) {
			return new Icici();
		}else{
			return new Axis();
		}
	}
}
class AbstractionBank {
	public static void main(String[] args) {
		Bank bank = Helperclass.getconnect("Oracle");
		bank.deposit();
	}
}