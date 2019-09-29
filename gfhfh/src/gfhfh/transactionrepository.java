package gfhfh;

public class transactionrepository {

public interface TransactionEntityDao extends JpaRepository<Transaction, Integer> {
	
	@Query("from Transaction where accountNo=?1")
	List<Transaction> printTransaction(long accNo);



}
