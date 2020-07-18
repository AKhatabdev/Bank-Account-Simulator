class Account 
{
	protected double theBalance = 0.00;
	protected double theOverdraft = 0.00; //Overdraft allowed
	
	public double getBalance() 
	{ 
		return theBalance; 
	}
	
	public double withdraw( final double money ) 
	{ 
		assert money >= 0.00; //Cause error if money -ve
		
		if ( theBalance - money >= theOverdraft) 
		{
			theBalance = theBalance - money;
			return money; 
	    } 
		
		else 
		{
			return 0.00; 
		}
	}
	
	public void deposit( final double money ) 
	{
		assert money >= 0.00; //Cause error if money -ve
	
	    theBalance = theBalance + money;
	}
	
	public double getTheOverdraft() {
		return theOverdraft;
	}

	public void setTheOverdraft(double theOverdraft) {
		this.theOverdraft = theOverdraft;
	}

}