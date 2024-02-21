interface Bank {
	void balance();
	void deposit(int amt);
	void withdraw(int amt);
}
class SavingAccount implements Bank {
	final long accountNo;
	String accountHolderName;
	String accountType;
	int balance;
	SavingAccount(long accountNo,String accountHolderName,String accountType, int balance) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
	}
	public void balance() {
		System.out.println("Account number: "+accountNo);
		System.out.println("Account Holder Name; "+accountHolderName);
		System.out.println("Account Type: "+accountType);
		System.out.println("Balance: "+balance);
	}
	public void deposit(int amt) {
		balance += amt;
		System.out.println(amt+ "Deposit successful on Account Number: "+accountNo);
	}
	public void withdraw(int amt) {
		if(amt<=balance) {
			balance-=amt;
			System.out.println(amt+ "Withdraw Successful remaining balance "+balance);
		}else{
			System.out.println("Insufficiant fund");
		}
	}
}
class LoanAccount implements Bank {
	final long accountNo;
	String accountHolderName;
	String accountType;
	int balance;
	LoanAccount(long accountNo,String accountHolderName,String accountType, int balance) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
	}
	public void balance() {
		System.out.println("Account number: "+accountNo);
		System.out.println("Account Holder Name; "+accountHolderName);
		System.out.println("Account Type: "+accountType);
		System.out.println("Balance: "+balance);
	}
	public void deposit(int amt) {
		balance -= amt;
		System.out.println(amt+  "Deposit successful on Account Number: "+accountNo);
	}
	public void withdraw(int amt) {
		if(amt+balance <=50000) {
			amt+=balance;
			System.out.println(amt+ "Withdraw Successful remaining balance "+balance);
		}else{
			System.out.println("Insufficiant fund");
		}
	}
}
class Manager {
	static long accountNo = 123456780000l;
	static Bank createAccount(String accountHolderName, String accountType,int balance) {
		if(accountType.equals("Saving")) {
			return new SavingAccount(accountNo++,accountHolderName,accountType,balance);
		}else {
			return new LoanAccount(accountNo++,accountHolderName,accountType,balance);
		}
	}
}


class AbstractionBankProject {
	public static void main(String[] args) {
		Bank bank = Manager.createAccount("Shradha khapra","SavingAccount", 100000);
		bank.balance();
		bank.deposit(200000);
		bank.withdraw(100000);
		bank.balance();
	}
}