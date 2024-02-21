class LoanAccount implements Bank {
	final long accountNum;
	String accountHolderName;
	String type;
	int balance;
	LoanAccount(long accountNum, String accountHolderName, String type, int balance) {
		this. = accountNum;
		this.accountHolderName = accountHolderName;
		this.type = type;
		this.balance = balance;
	}
	public void balance() {
		System.out.println("Account Number: "+accountNum);
	    System.out.println("Account Name: "+accountHolderName );
	    System.out.println("Account type: "+type);
	    System.out.println("Account balancr: "+type);
	}
	public void deposit(int amt) {
		amt -= balance;
		System.out.println(amt+" deposit successsful on your account number "+accountNum);
	}
	public void withdraw() {
		if(amt+balance <= 50000) {
			balance += amt;
			System.out.println(amt+" withdraw succesfull remaining balance "+balance);
		}else{
			System.out.println("Insufficiant balance withdraw failed");
		}
	}
}
class Manager {
	static long accountNum = 123456789000L;
	static Bank createAccount(String accountHolderName,String type, int balance) {
		if(type.equal("Saving")){
			return new SavingAccount(accountNum,accountHolderName, type,balance);
			}else if(type.equal("Loan")) {
				return new LoanAccount(accountNum,accountHolderName, type,balance);
			}else{
				return null;	
		}
	}
}
class Customer {
	public static void main(String[] args) {
		Bank bank = Manager.createAccount("ShradhaKhapra","Saving", 1000);
		bank.balance();
		bank.deposit(2000);
		bank.balance();
		bank.withdraw(1000);
		bank.balance();
	}
}