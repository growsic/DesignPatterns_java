
/*
 * Iteratorパターンの動作確認用クラス。
 * BookShelfに追加したBookをIteratorを用いて順番に表示します。
 */
public class Main {
        // 本棚の最大サイズ
	private final static int maxBookSize = 4;
	
	public static void main(String[] args) {
		
                // BookShelfの生成
		BookShelf books = new BookShelf(maxBookSize);
		
                // 本を追加
		books.appendBook(new Book("Harry Potter 1"));
		books.appendBook(new Book("Harry Potter 2"));
		books.appendBook(new Book("Harry Potter 3"));
		
                // 本棚の長さを表示
		System.out.println("bookShelf length:" + books.getLength());
		
                // Iteratorの取得
		Iterator iterator = books.iterator();
		
                // Iteratorで書籍名を表示
		while(iterator.hasNext()) {
			Book book = (Book)iterator.next();
			System.out.println(book.getName());
		}
	}

}
