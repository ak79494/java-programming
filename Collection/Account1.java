import java.util.*;
class Account1 {
	private String name;
	private String accNo;
	private double balance;
	 Account1(String name,String accNo,double balance) {
	 	this.name = name;
	 	this.accNo = accNo;
	 	this.balance = balance;

	 }
	 public String getName() {
	 	return name;
	 }
	 public void setName(String name) {
	 	this.name = name;
	 }
	 public String getAccNo() {
	 	return accNo;
	 }
	 public void setAccNo(String accNo) {
	 	this.accNo = accNo;

	 }
	 public double getBalance() {
	 	return balance;
	 }
	 public void setBalance(double balance) {
	 	this.balance = balance;
	 }
	 public void deosit(double amount) {
	 	balance += amount;
	 }
	 public void withDraw(double amount) {
	 	balance -= amount;
	 }
	 public String toString() {
	 	return "Name: "+name+ ", Account Number: "+accNo+ ", Balance: "+balance;
	 }
}