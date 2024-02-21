class Account {
  public String name;
  private String accountNumber;
  public double balance;

  public Account(String name, String accountNumber, double balance) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public String getAccountInfo() {
    return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
  }
}
