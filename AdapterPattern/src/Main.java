/*
 * アダプターパターンの動作確認用クラス。
 * BannerクラスをPrintインタフェース経由で利用する例を示します。
 */
public class Main {

	public static void main(String[] args) {
		Print print = new PrintBanner("Atepter Pattern");
		
		print.printWeak();
		print.printStrong();
	}

}
