package gfhfh;

public class BankService {
	public Account createAccount(Account bank) throws BankException;
	public Account accountsDetails(long accNo) throws BankException;
	public double showBalance(long accNo) throws BankException;
	public double deposit(long accNo, double amt) throws BankException;
	public double withdraw(long accNo, double amt) throws BankException;
	public double fundTransfer(long accNo1, double amt, long accNo2) throws BankException;
	public List<Transaction> printTransaction(long accNo) throws BankException;

}
