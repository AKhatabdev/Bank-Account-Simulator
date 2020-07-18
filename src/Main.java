class Main 
{
	public static void main( String args[] ) 
	{
		AccountBetter1 mike = new AccountBetter1();
		
		AccountBetter2 miri = new AccountBetter2();
		AccountBetter2 Awais = new AccountBetter2();
		
		AccountStudent dave = new AccountStudent();
		AccountStudent winkle = new AccountStudent();
		//Overdraft Limits
		Awais.setTheOverdraft(-100);
		mike.setTheOverdraft(-100);
		dave.setTheOverdraft(-5000);
		System.out.println("Before daily interest charge on a student account");
		System.out.printf( "dave Overdraft limit = %5.2f\n", dave.getTheOverdraft() );
		winkle.setTheOverdraft(-5000);
		
		//Deposits
		mike.deposit( 100.00 ); 
		miri.deposit( 100.00 );
		Awais.deposit(-100);
		dave.deposit(-5010);
		winkle.deposit(-5000);
		
		//Charging credit at the end of the day
		miri.inCredit(miri);
		miri.creditCharge(miri);
		
		dave.inCredit(dave);
		dave.creditCharge(dave);
		winkle.inCredit(winkle);
		winkle.creditCharge(winkle);
		
		System.out.println();
		System.out.println("(Exercise 1.5) Student Accounts:");
		System.out.println("£10 transferred from dave's account");
		System.out.printf( "dave Balance = %5.2f\n", dave.getBalance() );
		System.out.printf( "dave Overdraft = %5.2f\n", dave.getTheOverdraft() );
		System.out.println();
		System.out.printf( "winkle Balance = %5.2f\n", winkle.getBalance() );
		System.out.printf( "winkle Overdraft = %5.2f\n", winkle.getTheOverdraft() );
		System.out.println();
		
		//Transfer 10.00 from miri's account to mike's account 
		boolean res;
		
		System.out.print("(Exercise 1.4) Accounts will not let you transfer money when it will exceed your overdraft limit");
		System.out.println();
		System.out.println();
		
		//Checking withdrawls are NOT allowed when overdraft limit has been reached
		res = Awais.transferTo(miri, 10);
		if( !res )
		{ System.out.println( "Transfer to failed, Awais's overdraft limit reached" ); }
		else {
			System.out.printf( "Awais = %5.2f\n", Awais.getBalance() );
		}
		System.out.print("Applying interest to a classic account overdrawn");
		System.out.println();;
		Awais.inCredit(Awais);
		Awais.creditCharge(Awais);
		System.out.printf("Awais Balance = %5.2f\n", Awais.getBalance() );
		
		
	}
}	

/*
res = mike.transferFrom( miri, 10.00 );

if ( !res )
{ System.out.println( "Transfer from failed" ); }

//Transfer 120.00 from mike's account to cori's account 
res = mike.transferTo( cori, 120.00 );

if ( !res )
{ System.out.println( "Transfer to failed" ); } 
	else{
			System.out.print("Classic Accounts: ");
			System.out.printf( "Mike = %5.2f\n", mike.getBalance() ); 
			System.out.printf( "Miri = %5.2f\n", miri.getBalance() ); 
			System.out.printf( "Cori = %5.2f\n", cori.getBalance() );
			System.out.println();  
		}
*/