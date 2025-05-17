/*
 * Factory Methodパターンにおける抽象ファクトリ。
 * 製品を生成するための処理の流れを定め、
 * 実際の生成処理はサブクラスに委ねます。
 */
public abstract class Factory {
	
	public final Product create(String owner) {	
		Product product = createProduct(owner);
		registerProduct(product);
		return product;
	}
	public abstract Product createProduct(String ownersName);
	public abstract void registerProduct(Product product);
}
