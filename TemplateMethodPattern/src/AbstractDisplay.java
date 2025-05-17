
/*
 * Template Methodパターンの抽象クラス。
 * display()メソッドで処理の流れ(テンプレート)を定義し、
 * 具体的な実装はサブクラスに任せます。
 */
public abstract class AbstractDisplay {
	
        // display()から呼び出される抽象メソッド
	protected abstract void open();
	protected abstract void print();
	protected abstract void close();
	
        private final int MAX_COUNT = 5; // 表示回数
	
        // サブクラスでオーバーライドさせないテンプレートメソッド
        public final void display() {
		open();
		for(int i = 0; i < MAX_COUNT; i++) {
			print();
		}
		close();
	}
}
