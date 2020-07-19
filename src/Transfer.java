
public interface Transfer 
{
	boolean transferFrom(Account from, double amount);
	boolean transferTo(Account to, double amount);
}
