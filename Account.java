import java.lang.*;

/**
*
* @author krBello on 09/28/16
*/


public class Account {

	int accountNumber;
	double balance;
	
	public Account(int accNum, double bal) {
		accountNumber = accNum;
		balance = bal;
	}

	public Account(int accNum) {
		accountNumber = accNum;
		balance = 0.0;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double bal) {
		balance = bal;
	}

	public void credit(double amount) {
		balance += amount;
	}

	public void debit(double amount){
		if (balance > amount) {
			balance -= amount;
		} else {
			throw new IllegalArgumentException("Amount requested exceeds the current balance!");
		}
	}


	public String toString() {
		return String.format("A/C no: %d, Balance: $%.2f", accountNumber, balance);
	}
}
