package gfhfh;

public class accountrepository {

@Repository
public interface BankEntityDao extends JpaRepository<Account, Long> {

	@Query("select accNo,name,phoneNo,mailId,address from Account where accountNo =?1")
	List<Account> accountsDetails(@Param("c") long accNo);

	@Query("select be.currentBalance from account be where be.accountNo =?1")
	List<Double> showBalance(@Param("c") long accNo);
}

	

}
