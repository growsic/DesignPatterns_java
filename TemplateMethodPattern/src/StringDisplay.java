
/*
 * Template Methodパターンのもう一つの具体クラス。
 * 文字列全体を枠で囲んで表示します。
 */
public class StringDisplay extends AbstractDisplay {

	private String string;
	private int width;
	
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}
	
	@Override
	protected void open() {
		printLine();

	}

	@Override
	protected void print() {
		System.out.println("+" + string + "+");

	}

	@Override
	protected void close() {
		printLine();

	}
	//called before and after print method
	protected void printLine() {
		System.out.print("+");
		for(int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
