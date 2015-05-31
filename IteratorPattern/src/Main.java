
public class Main {
	//bookShelf size
	private final static int maxBookSize = 4;
	
	public static void main(String[] args) {
		
		//init BookShelf instance
		BookShelf books = new BookShelf(maxBookSize);
		
		//add books to bookshelf
		books.appendBook(new Book("Harry Potter 1"));
		books.appendBook(new Book("Harry Potter 2"));
		books.appendBook(new Book("Harry Potter 3"));
		
		//get bookshelf length
		System.out.println("bookShelf length:" + books.getLength());
		
		//generate iterator using BookShelf class method
		Iterator iterator = books.iterator();
		
		//print book's name using iterator
		while(iterator.hasNext()) {
			Book book = (Book)iterator.next();
			System.out.println(book.getName());
		}
	}

}
