/*
 * アダプターパターンのAdapterに相当するクラス。
 * Bannerクラスを継承し、Printインタフェースを実装することで
 * 既存クラスのメソッドをクライアントが期待する形式に変換します。
 */
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithPattern();
		
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
