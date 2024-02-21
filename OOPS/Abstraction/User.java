interface Account {
	void deposit();
	void withdraw();
	void getBalance();
}
class SavingAC implements Account {
	public void deposit() {
		System.out.println("Shraddha opening a saving A/C and deposit amount 5000");
	}
	public void withdraw(){
		System.out.println("Withdraw amount 2000 in saving account");
	}
	public void getBalance() {
		System.out.println("total amount on your account 3000");
	}
}
class LoanAC implements Account {
	public void deposit() {
		System.out.println("Shradha Personal Loan 10000");
		System.out.println("Deposit Loan amount 2000 is 8000 ");
	}
	public void withdraw(){
		System.out.println("Shraddha withdraw new Home loan 50000");
	}
	public void getBalance() {
		System.out.println("total loan personal loan due 8000 ");
		System.out.println("totalHome loan due 50000");
	}
}
class BankManager {
	static Account getconnect(String type) {
		if(type.equals("Saving account")){
			return new SavingAC();
		}else {
			return new LoanAC();
		}
	}
}
class User {
	public static void main(String[] args) {
		Account account = BankManager.getconnect("Loan account");
		account.deposit();
		account.withdraw();
		account.getBalance();
	}
}