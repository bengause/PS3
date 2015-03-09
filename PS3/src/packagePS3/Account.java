package packagePS3;

import java.util.Date;

public class Account {

	// private int data field id
	// All default to 0
	private int id = 0;

	// private double data field balnance
	private double balance = 0;

	// private double data field annualInterestRate
	private double annualInterestRate = 0;

	// Create a data field dateCreated that stores date of account creation
	private Date dateCreated = new Date();

	// No-arg Constructor
	public Account() {

	}

	// Constructor that creates an account with the specific id
	public Account(int id, double balance) {

		this.id = id;
		this.balance = balance;

	}

	// Getters and Setters for id, balance, annualInterestRate
	public int getid() {
		return id;
	}

	public double getbalance() {
		return balance;
	}

	public double getannualInterestRate() {
		return annualInterestRate;
	}

	// Setters
	public void setid(int id) {
		this.id = id;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// Getter for dateCreated
	public Date dateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		// Divide annual rate by 12
		double monthlyInterestRate = this.annualInterestRate / 12;

		// return the value
		return monthlyInterestRate;

	}

	public void withdraw(double amount) throws InsufficientFundsException {
		
		if (amount <= balance) {

			balance = balance - amount;

		} 
		else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public void deposit(double amount) {

		// Add amount to balance
		balance = balance + amount;

		
	}

}
