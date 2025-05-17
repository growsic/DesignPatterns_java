/*
 * アダプターパターンにおける既存クラス(Adaptee)。
 * 文字列を特定の形式で表示するメソッドを持ちますが、
 * Printインタフェースとは互換性がありません。
 * PrintBannerがこのクラスを継承し、Printインタフェースに適合させます。
 */
public class Banner {
	//field
	private String string;
	
	public Banner(String string) {
		this.string = string;
	}
	
	public void showWithPattern() {
		System.out.println("(" + this.string + ")");
	}
	
	public void showWithAster() {
		System.out.println("*" + this.string + "*");
	}
}
