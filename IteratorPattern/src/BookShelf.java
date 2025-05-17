import java.util.ArrayList;

/*
 * IteratorパターンのConcreteAggregateに相当するクラス。
 * Bookオブジェクトを内部に保持し、iterator()でBookShelfIteratorを生成します。
 */
public class BookShelf implements Aggregate {
	
	//field
//	private Book[] books;
	private ArrayList<Book> books;
	private int last;
	
	//constructor
	public BookShelf(int maxSize) {
		this.books = new ArrayList<Book>();
		this.last = 0;
	}
	
	public Book getBookAt(int index) {
		if(index <= last) {
			return books.get(index);
		}else{
			return null;
		}
	}
	
	//add book
	public void appendBook(Book book) {
		books.add(book);
		last++;
	}
	
	public int getLength() {
		return books.size();
	}

	@Override
        // iterator()はBookShelfIteratorを返す
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	
}
