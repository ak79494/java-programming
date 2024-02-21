import java.util.ArrayList;
class Accounthighest {
  String name = "Danie wyatt";
  String profession = "womens cricketer";
  String type = "right hand batsman";
  Long account =  12356600002L;
  String accountType = "Saving";
  int bal = 20000;
  
  public void display() {
    System.out.println("Name: "+this.name);
    System.out.println("Profession: "+this.profession);
    System.out.println("Type: "+this.type);
    System.out.println("Account : "+this.account);
    System.out.println("Account Type: "+this.accountType);
    System.out.println("Balance: "+this.bal);

  }
}
class BankClassAssaignment {
  public static void main(String[] args) { 
    Bank bank = new Bank();

    Account account1 = new Account("Shradha", "123456600001", 5000);
    Account account2 = new Account("Sakshi", "12345600002", 4500);
    Account account3 = new Account("Danie wyatt", "123456600003", 20000);

    bank.addAccount(account1);
    bank.addAccount(account2);
    bank.addAccount(account3);

    ArrayList < Account > accounts = bank.getAccounts();

    for (Account account: accounts) {
      System.out.println(account.getAccountInfo());
    }

    System.out.println("\nAfter depositing 1000 into account1:");
    bank.depositMoney(account1, 1000);
    System.out.println(account1.getAccountInfo());
    System.out.println("No transaction in account2:");
    System.out.println(account2.getAccountInfo());
    System.out.println("After withdrawing 5000 from account3:");
    bank.withdrawMoney(account3, 5000);
    System.out.println(account3.getAccountInfo());
    System.out.println();

    Accounthighest ac = new Accounthighest();
    ac.display();


  }

}