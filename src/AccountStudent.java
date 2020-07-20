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
class AccountStudent extends AccountPlatinum implements Interest {
	@Override
	public void creditCharge(Account name) {
		//APR 10% of Balance overdrawn
		double charge = 0.00026116;
		double chargeAmount = getBalance() * charge;
		double tempBalance = getBalance() + chargeAmount;
			
		if(!inCredit) {
			if(getBalance() < -5000) {
				System.out.printf("Student Charge: %5.2f\n", chargeAmount);
				//Set new Overdraft limit
				setTheOverdraft(tempBalance);
				System.out.printf("Overdraft changed: %5.2f\n", getTheOverdraft());
				//New Balance with charge applied
				theBalance = tempBalance;
			}
		}
	}
}
