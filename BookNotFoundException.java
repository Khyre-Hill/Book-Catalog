/*
 * Author Khyre Hill
 */
package assg3_hillkh19;

public class BookNotFoundException extends Exception {
	/*
	 * two constructors with with param one without
	 * get error method
	 */
	private String errorMessage;
	
	public BookNotFoundException() {
		this.errorMessage = "Book not found";
	}
	
	/*
	 * param string type
	 */
	public BookNotFoundException(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
}