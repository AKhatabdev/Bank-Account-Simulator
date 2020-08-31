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
	protected double theOverdraft = 0.00; // Overdraft allowed
	
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



	//@ requires true;
	//@ ensures \result == theOverDraft;
	public /*@ pure @*/ double getTheOverdraft() { return theOverdraft; }

	//@ requires n <= 0;
	//@ ensures n == theOverDraft;
	public void setTheOverdraft(double n) { this.theOverdraft = n; }
}
/*
	pure: any method without any side effects

	<precondition>
	@requires 'Boolean': makes sure that the condition is true or false
	@requires a && x && p && q: each variable is required true

	<post condition>
	@ensures newBalance == \old(balance - n &&
							\result == newBalance;
	This makes sure that this is true before execution of the method

	JML EXPRESSIONS
	!a (“not a")
	a && b (“a and b")
	a || b (“a or b")
	a ==> b (“a implies b")
	a <==> b (“a is equivalent to b")

	 If a and b are boolean JML expressions, x a variable of
	type T:
	(\forall T x;a) (“for all x of type T, a is true")
	(\exists T x;a) (“there exists x of type T such that a")
	(\forall T x;a;b) (“for all x of type T fulfilling a, b is true")
	(\exists T x;a;b) (“there exists an x of type T fulfilling a,
	such that b is true")

*/
