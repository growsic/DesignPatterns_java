/*
 * Template Methodパターンの動作確認用クラス。
 * AbstractDisplayを継承した各クラスのdisplay()を呼び出して動作を確認します。
 */
public class Main {
	
	public static void main(String[] args) {
                // CharDisplayとStringDisplayの生成
		AbstractDisplay d1 = new CharDisplay('h');
		AbstractDisplay d2 = new StringDisplay("hello");
		
                // displayメソッドの呼び出し
		d1.display();
		d2.display();
	}

}
