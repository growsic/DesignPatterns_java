

/*
 * Iteratorパターンの集合体を表すインタフェース。
 * 自身の要素を走査するIteratorを生成する役割を持ちます。
 */
public interface Aggregate {
	public abstract Iterator iterator();
}
