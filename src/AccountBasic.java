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
class AccountBasic extends Account implements Transfer {

	public boolean transferFrom(Account from, double amount) {
		assert amount >= 0.00; //makes sure the amount is not -ve
		//Checking if amount is not greater then the available balance
		if(theBalance - amount >= theOverdraft) {
			from.withdraw(amount); //withdraw from an account the amount
			deposit(amount);	   //deposit the amount withdrawn to the account requesting the transferFrom 
			return true;		   //return true if successful
		} else {return false;} //else Amount is over the available balance return FALSE
	}
	
	public boolean transferTo(Account to, double amount) {
		assert amount >= 0.00; //makes sure the amount is not -ve
		//Checking if amount is not greater then the available balance
		if(theBalance - amount >= theOverdraft) {
			withdraw(amount);   //withdraw amount from account
			to.deposit(amount); //deposit the amount withdrawn to the recipient account transferTo 
			return true;		//return true if successful
		} else {return false;} //else Amount is over the available balance return FALSE
	}
}
