package gfhfh;


@ControllerAdvice
public class BankExceptionHandler {
	@ExceptionHandler(BankException.class)
	public ResponseEntity <String> handleException(Exception ex){
		return new ResponseEntity <String> (ex.getMessage(), HttpStatus.CONFLICT);
	}

}
