
public interface Transfer 
{
	public boolean transferFrom( Account from, double amount );
	public boolean transferTo( Account to, double amount );
}
