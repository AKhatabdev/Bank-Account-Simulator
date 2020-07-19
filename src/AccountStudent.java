
class AccountStudent extends AccountBetter2 implements Interest {
	@Override
	public void creditCharge(Account name) {	//APR 10% of Balance overdrawn
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
