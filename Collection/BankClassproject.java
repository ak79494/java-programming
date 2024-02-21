import java.util.ArrayList;
class BankClassproject {
	public static void main(String[] args) {
		Bank1 bank = new Bank1();
		Account account1  = new Account("Arun", "123456789001", 100000);
		Account account2  = new Account("Shekhar", "123456789002", 200000);
		Account account3  = new Account("Mukesh", "123456789003", 300000);
		Account account4  = new Account("Payal", "123456789004", 400000);
		bank.addAccount(account1);
		bank.addAccount(account2);
		bank.addAccount(account3);
		bank.addAccount(account4);

		ArrayList<Account> accounts = bank.getAccounts();
		for(Account account : accounts) {
			System.out.println(account.toString());
		}
		System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.toString());
        System.out.println("No transaction in account2:");
        System.out.println(account2.toString());
        System.out.println("After withdrawing 5000 from account3:");
        bank.withdrawMoney(account3, 5000);
        System.out.println(account3.toString());
        System.out.println("No transaction account4 :");
        System.out.println(account4.toString());

        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
        System.out.println(account4.toString());
	}
}