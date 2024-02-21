interface Bank {
	void balance();
	void deposit(int amt);
	void withdraw(int amt);
}
class SavingAccount implements Bank {
	final long accountNum;
	String accountHolderName;
	String accountType;
	int balance;
	SavingAccount(long accountNum, String accountHolderName, String accountType, int balance) {
		this.accountNum = accountNum;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
	}
	public void balance() {
		System.out.println("Account Number: "+accountNum);
	    System.out.println("Account Name: "+accountHolderName );
	    System.out.println("Account type: "+accountType);
	    System.out.println("Account balance: "+balance);
	}
	public void deposit(int amt) {
		balance += amt;
		System.out.println(amt+" deposit successsful on your account number "+accountNum);
	}
	public void withdraw(int amt) {
		if(amt<=balance) {
			balance -= amt;
			System.out.println(amt+" withdraw succesfull remaining balance "+balance);
		}else{
			System.out.println("Insufficiant balance withdraw failed");
		}
	}
}
class LoanAccount implements Bank {
	final long accountNum;
	String accountHolderName;
	String accountType;
	int balance;
	LoanAccount(long accountNum, String accountHolderName, String accountType, int balance) {
		this.accountNum = accountNum;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
	}
	public void balance() {
		System.out.println("Account Number: "+accountNum);
	    System.out.println("Account Name: "+accountHolderName );
	    System.out.println("Account type: "+accountType);
	    System.out.println("Account balancr: "+balance);
	}
	public void deposit(int amt) {
		balance -= amt;
		System.out.println(amt+" deposit successsful on your account number "+accountNum);
	}
	public void withdraw(int amt) {
		if((amt+balance) <= 50000){
			balance += amt;
			System.out.println(amt+" withdraw succesfull remaining balance "+balance);
		}else{
			System.out.println("Insufficiant balance withdraw failed");
		}
	}
}
class Manager {
	static long accountNum = 123456789000L;
	static Bank createAccount(String accountHolderName,String accountType, int balance) {
		if(accountType.equals("Saving")){
			return new SavingAccount(accountNum++,accountHolderName,accountType,balance);
			}else if(accountType.equals("Loan")) {
				return new LoanAccount(accountNum++,accountHolderName,accountType,balance);
			}else{
				return null;	
		}
	}
}
class Customer1 {
	public static void main(String[] args) {
		Bank bank = Manager.createAccount("ShradhaKhapra","Saving", 1000);
		bank.balance();
		bank.deposit(2000);
		bank.balance();
		bank. withdraw(1000);
		bank.balance();

		Bank bank2 = Manager.createAccount("ShradhaKhapra","Loan", 50000);
		bank2.balance();
		bank2.deposit(30000);
		bank2.balance();
		bank2. withdraw(20000);
		bank2.balance();
	}
}