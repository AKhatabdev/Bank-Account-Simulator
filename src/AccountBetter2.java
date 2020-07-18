
class AccountBetter2 extends AccountBetter1 implements Interest
{
	//Boolean to decide if Account is in credit or needs to be charged
	boolean a;
	
	public boolean inCredit(Account name) 
	{
		if(getBalance() >= 0.0) {a = true;}
		
		return a;
	}
	
	public void creditCharge(Account name) 
	{	//APR 10% of Balance overdrawn
		double charge = 0.00026116;
		double chargeAmount = getBalance() * charge;
		double tempBalance = getBalance() + chargeAmount;
				
		if(a != true)
		{					
			System.out.printf("Charge: %5.2f\n", chargeAmount);
			//If balance with charge is > overdraft
			if(tempBalance > getTheOverdraft())
			{
				//Set new Overdraft limit
				setTheOverdraft(tempBalance);
				System.out.printf("Overdraft limit exceeded: %5.2f\n", getTheOverdraft());
			}
			//New Balance with charge applied
			theBalance = tempBalance;
		}
	}
}
