/*
 * Author Khyre Hill
 */
package assg3_hillkh19;


import java.util.*;
import java.io.*;

public class BookDemo {

	/*
	 * reads array with book files in it
	 */
	 static Book catalog[] = new Book[200];
	 static int total = 0;
	 
			 public static void main (String[] args) {
		
		String filename = "catalog.txt";
		Scanner inputStream = null;
		String line;
		
		try {
			inputStream = new Scanner (new File(filename));
		}
		catch (FileNotFoundException e) {
			System.out.println("Book Not Found");
			System.exit(1);
		}
		
		while (inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			System.out.println(line);
			
		}
		/*
		 * search if book is in catalog
		 * catch not able to handle exception has to go back to calle rprogram
		 */
		inputStream.close();
		int Bookid;
		inputStream = new Scanner(System.in);
	


	
	
	while (true) {
		System.out.println("Enter Book id:");
		Bookid = inputStream.nextInt();
		if (Bookid == 0) {
			System.out.println("Closing database");
			System.exit(0);
		}
		
		try {
			
			int index = Book.Book_search(catalog, total, Bookid);
			
			
			System.out.println(catalog[index]);
		}
		catch (BookNotFoundException e) {
			System.out.println(e.getErrorMessage());
		}
	}
}
}

	
	