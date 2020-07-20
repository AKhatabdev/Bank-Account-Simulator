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
class Main {
	public static void main(String[] args) {
		//Creating Bank Accounts Examples
		AccountPlatinum Awais = new AccountPlatinum();
		AccountBasic Mike = new AccountBasic();
		AccountPlatinum Miri = new AccountPlatinum();
		AccountStudent Dave = new AccountStudent();
		AccountStudent Winkle = new AccountStudent();

		//Overdraft Limits Examples
		Awais.setTheOverdraft(-100);
		Mike.setTheOverdraft(-100);
		Dave.setTheOverdraft(-5000);
		System.out.println("Before daily interest charge on a student account");
		System.out.printf( "Dave Overdraft limit = %5.2f\n", Dave.getTheOverdraft() );
		Winkle.setTheOverdraft(-5000);
		
		//Deposits Examples
		Mike.deposit( 100.00 );
		Miri.deposit( 100.00 );
		Awais.deposit(-100);
		Dave.deposit(-5010);
		Winkle.deposit(-5000);
		
		//Charging credit at the end of the day Examples
		Miri.inCredit(Miri);
		Miri.creditCharge(Miri);
		
		Dave.inCredit(Dave);
		Dave.creditCharge(Dave);
		Winkle.inCredit(Winkle);
		Winkle.creditCharge(Winkle);
		
		System.out.println();
		System.out.println("Example of Student Accounts:");
		System.out.println("£10 transferred from Dave's account");
		System.out.printf( "Dave Balance = %5.2f\n", Dave.getBalance() );
		System.out.printf( "Dave Overdraft = %5.2f\n", Dave.getTheOverdraft());
		System.out.println();
		System.out.printf( "Winkle Balance = %5.2f\n", Winkle.getBalance() );
		System.out.printf( "Winkle Overdraft = %5.2f\n", Winkle.getTheOverdraft() );
		System.out.println();
		
		//Transfer 10.00 from Miri's account to Mike's account

		System.out.print("Example Accounts will not let you transfer money when it will exceed your overdraft limit\n");
		//Checking withdraw are NOT allowed when overdraft limit has been reached
		boolean res;
		res = Awais.transferTo(Miri, 10);
		if( !res ) { System.out.println( "Transfer failed, Awais's overdraft limit reached" ); }
		else { System.out.printf( "Awais = %5.2f\n", Awais.getBalance() ); }

		res = Awais.transferFrom(Miri, 10);
		if( !res ) { System.out.println( "Transfer failed, Awais's overdraft limit reached" ); }
		else { System.out.printf( "Awais = %5.2f\n", Awais.getBalance() ); }

		System.out.print("Applying interest to a Platinum account overdrawn\n");
		Awais.inCredit(Awais);
		Awais.creditCharge(Awais);
		System.out.printf("Awais Balance = %5.2f\n", Awais.getBalance() );
		
	}
}