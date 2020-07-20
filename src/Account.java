/*
Author: Awais Khatab
Title: Bank Account Simulator, Practice, Testing and Prototyping
Version: 1.1.0

Note:
Basic Banking App Simulator is a small project I created to help you learn some Java programming :)

Quick tip to start:
Look around at the Account classes and make sure to read the comments carefully,
they will help you try to understand the code.

Once you have had a look around try creating some accounts and make some transfers between them!
 */
class Account {
	protected double theBalance = 0.00;
	protected double theOverdraft = 0.00; //Overdraft allowed
	
	public double getBalance() { return theBalance; }
	
	public void withdraw(final double money ) {
		assert money >= 0.00; //Cause error if money -ve

		if ( theBalance - money >= theOverdraft) {
			theBalance = theBalance - money;
		}
	}
	
	public void deposit( final double money ) {
		assert money >= 0.00; //Cause error if money -ve
	    theBalance = theBalance + money;
	}
	
	public double getTheOverdraft() { return theOverdraft; }
	public void setTheOverdraft(double theOverdraft) { this.theOverdraft = theOverdraft; }
}