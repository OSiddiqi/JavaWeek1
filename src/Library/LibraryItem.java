package Library;

import java.util.ArrayList;

public class LibraryItem {

	String itemName;
	int itemId;

	ArrayList<LibraryItem> collection = new ArrayList<LibraryItem>();
	ArrayList<Book> BookCollection = new ArrayList<Book>();

	public void addBook(Book b) {
		BookCollection.add(b);

	}
}
