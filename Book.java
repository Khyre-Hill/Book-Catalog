/*
 * Author Khyre Hill
 */
package assg3_hillkh19;

public class Book {

	private int Bookid ;
	private String Book_title;
	private String ISBN;
	private String Author_last_name;
	private char Category;
	public int Booksearch;
	 
	/*
	 *  Initialize getters and setters 
	 *  Get book id , book title, isbn, authors last name, category
	 *  Also must have setters
	 *  Sets book id, title, isbn, authors last name, and category 
	 */
	public int getBookid() {
		return Bookid;
	}
	
	public String getBook_title() {
		return Book_title;
	}
	
	
	public String getISBN() {
		return ISBN;
	}
	
	
	public String getAuthor_last_name() {
		return Author_last_name;
	}
	
	
	
	public char getCategory() {
		return Category;
	}
	
	
	public void setBook_id(int Bookid) {
		this.Bookid = Bookid;
	}
	
	public void setBook_title(String Book_title) {
		this.Book_title = Book_title;
	}
	
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	
	public void setAuthor_last_name(String Author_last_name) {
		this.Author_last_name = Author_last_name;
	}
	
	
	public void setCategory (char Category) {
		this.Category = Category;
	}
	
	@Override
	/*
	 * takes no params 
	 * formats print book id title isbn authors last name and category
	 * category is either fiction book or non fiction book
	 */
	public String toString() {
		String thisString = "Book id:" + this.Bookid + "Title:" + this.Book_title 
				+ "ISBN:" + this.ISBN + "Authors last name:" + this.Author_last_name + "Category:";
		
		if (Category == 'F') {
			thisString += "Fiction";
		}
		
		if (Category == 'N') {
			thisString += "Non-fiction";
		}
		return thisString;
	}


	/*
	 * 3 params catalog, total book id
	 * searches array looking for given book
	 * returns index in array
	 */
	
public static int Book_search(Book catalog[], int total, int Bookid) throws BookNotFoundException {
	for (int a=0; a < total; a++) {
		if (catalog[a].getBookid() == Bookid) {
			return a;
		}
	}
	
	throw new BookNotFoundException ("Book ID: " + " not found.");
}

}
	
	
	
	
	

