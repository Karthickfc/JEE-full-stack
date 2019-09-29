package gfhfh;

@Table(name = "BankEntity")
@Entity
public class account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "a")
	@SequenceGenerator(name = "a", sequenceName = "accoun")
	@Column(length = 15)
	private long accountNo;
	@Min(4)
	@Max(20)
	@Column(length = 15)
	private String name;
	@Min(10)
	@Max(11)
	@Column(length = 10)
	private long phoneNo;
	@Min(4)
	@Max(20)
	@Column(length = 15)
	private String mailId;
	@Min(4)
	@Max(20)
	@Column(length = 15)
	private String address;
	@Min(100)
	@Max(1000000)
	private double currentBalance;

	public account() {
		super();

	}

	public long getAccountNo() {
		return accountNo;
	}

	public account(long accountNo, String name, long phoneNo, String mailId, String address, double currentBalance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.phoneNo = phoneNo;
		this.mailId = mailId;
		this.address = address;
		this.currentBalance = currentBalance;
	}

	@Override
	public String toString() {
		return "account [accountNo=" + accountNo + ", name=" + name + ", phoneNo=" + phoneNo + ", mailId=" + mailId
				+ ", address=" + address + ", currentBalance=" + currentBalance + "]";
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

}
