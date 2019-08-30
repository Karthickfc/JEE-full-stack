//make the necessary change to make this class a Exception
public class SalaryNegativeException extends Exception{
	
	public SalaryNegativeException(String message) {
		System.out.println(message);
	}
	
}