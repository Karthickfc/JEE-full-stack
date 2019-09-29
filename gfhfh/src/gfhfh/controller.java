package gfhfh;

RestController
@RequestMapping("/BankApplication")
public class controller {
	
	@Autowired
	BankService bankService;

	@GetMapping("/ShowOptions")
	public ResponseEntity<String> ShowOptions() {
		return new ResponseEntity<String>("Welcome to UnsignedInteger Bank\n\n"+
				"1. Create Account 		: 	/CreateAccount\n"
				+ "2. Show Details 		: 	/ShowDetails/{accNo}\n"
				+ "3. Show Balance		: 	/ShowBalance/{accNo}\n"
				+ "4. Deposite Amount 	: 	/DepositAmount/{accNo}/{amt}\n"
				+ "5. Withdraw Amount 	: 	/WithdrawAmount/{accNo}/{amt}\n"
				+ "6. Fund Transafer 	: 	/FundTransfer/{accNo1}/{amt}/{accNo2}\n"
				+ "7. Mini Statement 	: 	/MiniStatement/{accNo}", HttpStatus.OK);
	}
	
	@PostMapping("/CreateAccount")
	public Account createAccount(@RequestBody Account bank) throws BankException {
		return bankService.createAccount(bank);
	}

	@GetMapping("/ShowDetails/{accountNo}")
	public Account accountsDetails(@PathVariable long accNo) throws BankException {
		return bankService.accountsDetails(accNo);
	}

	@GetMapping("/ShowBalance/{accountNo}")
	public ResponseEntity<String> showBalance(@PathVariable long accNo) throws BankException {
		Double bal = bankService.showBalance(accNo);
		return new ResponseEntity<String>("Your Current Balance : " + bal, HttpStatus.OK);
	}

	@PutMapping("/DepositAmount/{accNo}/{amount}")
	public ResponseEntity<String> deposit(@PathVariable long accNo, @PathVariable double amount) throws BankException {
		double bal = bankService.deposit(accNo, amount);
		return new ResponseEntity<String>("Amount Deposite Successfully :-)\n"
				+ "\n\nTransaction Amount : "+amount
				+"\n\n-----------------------------------------\n"
				+ "Your Updated Balance : " +bal
				+ "\n-----------------------------------------", HttpStatus.OK);
	}

	@PutMapping("/WithdrawAmount/{accNo}/{amount}")
	public ResponseEntity<String> withdraw(@PathVariable long accNo, @PathVariable double amount) throws BankException {
		double bal = bankService.withdraw(accNo, amount);
		return new ResponseEntity<String>("Amount Withdrawn Successfully :-)\n"
				+ "\n\nTransaction Amount : "+amount
				+"\n\n-----------------------------------------\n"
				+ "Your Updated Balance : " +bal
				+ "\n-----------------------------------------", HttpStatus.OK);
	}

	@PutMapping("/FundTransfer/{sender}/{amount}/{reciver}")
	public ResponseEntity<String> fundTransfer(@PathVariable long sender, @PathVariable double amount,
			@PathVariable long reciver) throws BankException {
		double bal = bankService.fundTransfer(sender, amount, reciver);
		return new ResponseEntity<String>("Amount Transferred Successfully :-)\n-----------------------------------------"
				+ "\n\nTransaction Amount : "+amount
				+ "\nTransferred to : "+reciver+"\n\n-----------------------------------------\n"
				+ "Your Updated Balance : " +bal
				+ "\n-----------------------------------------", HttpStatus.OK);
	}

	@GetMapping("/MiniStatement/{accNo}")
	public List<Transaction> printTransaction(@PathVariable long accNo) throws BankException {
		return bankService.printTransaction(accNo); 
	}


}
