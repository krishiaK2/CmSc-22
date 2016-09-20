import java.lang.*;

/**
*
* @author krBello
*/


public class Account {

	int accountNumber;
	double balance;
	
	public Account(int accNum, double bal) {

		this.accountNumber = accNum;
		this.balance = bal;
	
	}

	public Account(int accNum) {

		this.accountNumber = accNum;
		balance = 0.0;
	
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double bal) {
		this.balance = bal;
	}

	public void credit(double amount) {
		balance = balance + amount;
	}

	public void debit(double amount){
		if (balance > amount) {
			balance = balance - amount;
		} else {
			throw new IllegalArgumentException("EXCEED!");
		}
	}


	public String toString() {
		return String.format("A/C no: %d ,Balance: $ %.2f", accountNumber, balance);
	}
}