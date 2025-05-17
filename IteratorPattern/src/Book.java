
/*
 * Iteratorパターンで走査される要素を表すクラス。
 * ここでは書籍の名前のみを保持しています。
 */
public class Book {
	private String name;
	
	public Book(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
