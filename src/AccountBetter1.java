/*	
    Author: Awais Khatab
	Exercise: 1.3
	Module: CI228 
*/

class AccountBetter1 extends Account implements Transfer
{
	
	public boolean transferFrom(Account from, double amount) 
	{
		assert amount >= 0.00; //makes sure the amount is not -ve
		//Checking if amount is not greater then the available balance
		if(theBalance - amount >= theOverdraft)
		{
			from.withdraw(amount); //withdraw from an account the amount
			deposit(amount);	   //deposit the amount withdrawn to the account requesting the transferFrom 
			return true;		   //return true if successful
		}
		else {return false;} //else Amount is over the available balance return FALSE
	}
	
	public boolean transferTo(Account to, double amount) 
	{
		assert amount >= 0.00; //makes sure the amount is not -ve
		//Checking if amount is not greater then the available balance
		if(theBalance - amount >= theOverdraft)
		{	
			withdraw(amount);   //withdraw amount from account
			to.deposit(amount); //deposit the amount withdrawn to the recipient account transferTo 
			return true;		//return true if successful
		}
		else {return false;} //else Amount is over the available balance return FALSE
	}
}
