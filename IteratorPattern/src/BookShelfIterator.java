
/*
 * IteratorパターンのConcreteIterator。BookShelfの要素を順に返します。
 */
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
         * まだ要素が残っているかを判定する
         * @return 残っていればtrue
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
         * 次のBookオブジェクトを返し、カーソルを進める
         * @return 次のBook
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
