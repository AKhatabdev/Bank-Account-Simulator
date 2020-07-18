
public interface AccountProtocol 
{
	public double getBalance();
	
	public void deposit(final double money);
	public double withdraw(final double money);
	
	public default void bonus()
	{
		deposit (100.00);
	}
}
