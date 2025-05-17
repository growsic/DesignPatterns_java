/*
 * アダプターパターンで使用するターゲットインタフェース。
 * クライアントはこのインタフェースを通して機能を利用します。
 * PrintBannerがこのインタフェースを実装します。
 */
public interface Print {
	
	public void printWeak();
	public void printStrong();
}
