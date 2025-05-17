
/*
 * 走査処理を行うためのIteratorインタフェース。
 * hasNext()とnext()を利用して順番に要素を取得します。
 */
public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();

}
