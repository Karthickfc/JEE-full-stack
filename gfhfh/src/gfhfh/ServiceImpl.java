package gfhfh;


@Service
public class ServiceImpl implements BankService{
	@Autowired
	BankRepository bankDao;

	@Autowired
	TransactionRepository transDao;

	public Account createAccount(Account bank) throws BankException {
		if(bank.getBal()==null || bank.getBal()<=0){
			throw new BankException("Balance can not be 0");
		}else {
			bankDao.save(bank);
			return bankDao.findById(bank.getAccNo()).get();
		}
	}

	public Account accountsDetails(long accNo) throws BankException {
		if(!bankDao.findById(accNo).isPresent()) {
			throw new BankException("Sorry, Account No. Not Exist\nPlease Enter a valid Account No.!!");
		}else{
			return bankDao.findById(accNo).get();
		}
	}

	public double showBalance(long accNo) throws BankException {
		if(!bankDao.findById(accNo).isPresent()) {
			throw new BankException("Sorry, Account No. Not Exist\nPlease Enter a valid Account No.!!");
		}else{
			return  bankDao.findById(accNo).get().getBal();
		}

	}

	public double deposit(long accNo, double amt) throws BankException {

		Optional<Account> bank = bankDao.findById(accNo);
		if (bank.isPresent()) {
			Account tempEntity = bank.get();
			tempEntity.setBal(bank.get().getCurrentBalance() + amt);
			bankDao.save(tempEntity);
			Transaction trans = new Transaction(accNo, "Deposite",
					bank.get().getCurrentBalance() + amt);
			transDao.save(trans);
			return showBalance(accNo);
		} else {
			throw new BankException("Sorry, Account No. Not Exist\nPlease Enter a valid Account No.!!");
		}
	}

	public Double withdraw(Long accNo, Double amt) throws BankException {
		Optional<Account> bank = bankDao.findById(accNo);
		if (bank.isPresent()) {
			if(amt>showBalance(accNo)) {
				throw new BankException("Insufficient Balance :-(");
			}else {
				Account tempEntity = bank.get();
				tempEntity.setBal(bank.get().getCurrentBalance() - amt);
				bankDao.save(tempEntity);
				Transaction trans = new Transaction(accNo, "Withdraw",bank.get().getCurrentBalance() - amt);
				transDao.save(trans);
				return showBalance(accNo);	
			}
		} else {
			throw new BankException("Sorry, Account No. Not Exist\nPlease Enter a valid Account No.!!");
		}
	}

	public Double fundTransfer(Long senderAcc, Double amt, Long reciverAcc) throws BankException {
		Optional<Account> senderAccount = bankDao.findById(senderAcc);
		Optional<Account> reciverAccount = bankDao.findById(reciverAcc);
		if (senderAccount.isPresent() && reciverAccount.isPresent()) {

			Account sender = senderAccount.get();
			sender.setCurrentBalance(senderAccount.get().getCurrentBalance() - amt);
			bankDao.save(sender);

			BankEntity reciver = reciverAccount.get();
			reciver.setCurrentBalance(reciverAccount.get().setCurrentBalance() + amt);
			bankDao.save(reciver);

			Transaction senderTrans = new Transaction(senderAcc, "Fund Transfered",senderAccount.get().getCurrentBalance() - amt);
			transDao.save(senderTrans);

			TransactionEntity reciverTrans = new Transaction(reciverAcc, "Fund Recieved", amt + reciverAccount.get().getBal());
			transDao.save(reciverTrans);

			return showBalance(senderAcc);
		} else {
			throw new BankException("Sorry, Account No. Not Exist\nPlease Enter a valid Account No.!!");
		}
	}

	public List<Transaction> printTransaction(long accNo) throws BankException {
		if(!bankDao.findById(accNo).isPresent()) {
			throw new BankException("Sorry, Account No. Not Exist\nPlease Enter a valid Account No.!!");
		}else{
			return transDao.printTransaction(accNo);
		}
	}
}


}
