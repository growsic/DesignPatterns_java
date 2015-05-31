
public class BookShelfIterator implements Iterator {
	
	//field
	private BookShelf bookshelf;
	private int index;
	
	//Constructor
	public BookShelfIterator(BookShelf bookshelf) {
		this.bookshelf = bookshelf;
		this.index = 0;
	}

	@Override
	/**
	 * @return boolean if bookshelf has another book
	 */
	public boolean hasNext() {
		if(index < this.bookshelf.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	/**
	 * get next book from bookshelf and move Cursor to next
	 * @return Book
	 */
	public Object next() {
		if(hasNext()) {
			Book book = this.bookshelf.getBookAt(index);
			index++;
			return book;
		}else {
			return null;
		}
		
	}

}
