interface Bank1 {
	void balance();
	void deposit(int amt);
	void withdrawl(int amt);
}
class SavingAccount1 implements Bank1 {
	final long accountNumber;
	String accountHolderName;
	String accountType;
	int balance;
	SavingAccount1(long accountNumber,String accountHolderName,String accountType,int balance){
		this.accountNumber = accountNumber;
	    this.accountHolderName = accountHolderName;
	    this.accountType = accountType;
	    this.balance = balance;
	}
	public void balance() {
		System.out.println("accountNumber :"+accountNumber);
		System.out.println("accountHolderName : "+accountHolderName);
		System.out.println("accountType :"+accountType);
		System.out.println("balance :"+balance);
	}
	public void deposit(int amt) {
		balance+=amt;
		System.out.println(amt+" deposit successful on your account number "+accountNumber);
	}
	public void withdrawl(int amt){
		if(amt<=balance) {
			balance-=amt;
			System.out.println(amt+" withdrawal successful remaining balance "+balance);
		}	
	}
}
class LoanAccount1 implements Bank1 {
	final long accountNumber;
	String accountHolderName;
	String accountType;
	int balance;

	LoanAccount1(long accountNumber,String accountHolderName,String accountType,int balance){
		this.accountNumber = accountNumber;
	    this.accountHolderName = accountHolderName;
	    this.accountType = accountType;
	    this.balance = balance;
	}
	public void balance() {
		System.out.println("accountNumber :"+accountNumber);
		System.out.println("accountHolderName : "+accountHolderName);
		System.out.println("accountType :"+accountType);
		System.out.println("balance :"+balance);
	}
	public void deposit(int amt) {
		balance-=amt;
		System.out.println(amt+" deposit successful on your account number "+accountNumber);
	}
	public void withdrawl(int amt){
		if((amt+balance) <= 50000) {
			balance+=amt;
			System.out.println(amt+" withdrawal successful remaining balance "+balance);
		}else{
			System.out.println("Insufficiant balanace withdrwal failed");
		}
	}	
}
class ManagerClass {
	static long accountNumber = 123456789000L;
	static Bank1 createAccount(String accountHolderName, String accountType, int balance) {
		if(accountType.equals("Saving")) {
			return new SavingAccount1(accountNumber++,accountHolderName,accountType,balance);
		}else{
			return new LoanAccount1(accountNumber++,accountHolderName,accountType,balance);
		}
	}
}
class Interfaceperson {
	public static void main(String[] args) {
		Bank1 bank = ManagerClass.createAccount("ShradhaKhapra","Saving", 1000);
		bank.balance();
		bank.deposit(20000);
		bank.balance();
		bank.withdrawl(10000);
		bank.balance();

		Bank1 bank2 = ManagerClass.createAccount("ShradhaKhapra","Loan", 50000);
		bank2.balance();
		bank2.deposit(30000);
		bank2.balance();
		bank2.withdrawl(20000);
		bank2.balance();
		
	}
}