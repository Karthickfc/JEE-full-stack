package gfhfh;

@Entity
@Table(name = "TransactionEntity")
public class transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "a")
	@SequenceGenerator(name = "a", sequenceName = "transactionSeq")
	@Column(length = 20)
	private Integer transactionId;
	@Min(4)
	@Max(12)
	private long accountNo;
	private String description;
	@Min(100)
	@Max(1000000)
	private double currentBalance;

	public transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public transaction(long accountNo, String description, double currentBalance) {
		super();
		
		this.accountNo = accountNo;
		this.description = description;
		this.currentBalance = currentBalance;
	}

	@Override
	public String toString() {
		return "transaction [transactionId=" + transactionId + ", accountNo=" + accountNo + ", description="
				+ description + ", currentBalance=" + currentBalance + "]";
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

}
