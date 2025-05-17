
/*
 * Template Methodパターンの具体クラス。
 * 1文字を表示するための実装を提供します。
 */
public class CharDisplay extends AbstractDisplay {
	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}
	
	@Override
	protected void open() {
		System.out.print("<<");

	}

	@Override
	protected void print() {
		System.out.print(this.ch);
	}

	@Override
	protected void close() {
		System.out.println(">>");

	}

}
