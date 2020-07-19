
public interface AccountProtocol {
	double getBalance();
	void deposit(final double money);
	double withdraw(final double money);
	default void bonus()
	{
		deposit (100.00);
	}
}
