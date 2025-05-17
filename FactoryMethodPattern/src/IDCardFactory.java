import java.util.ArrayList;
import java.util.List;


/*
 * Factory Methodパターンの具体的ファクトリ。
 * IDCardインスタンスを生成し、所有者リストを管理します。
 */
public class IDCardFactory extends Factory {
	private List ownerList = new ArrayList();
	private int idCounter = 1000;
	@Override
	public Product createProduct(String ownersName) {
		
		return new IDCard(ownersName, idCounter++);
	}

	@Override
	public void registerProduct(Product product) {
		ownerList.add(product);

	}
	public List getOwners() {
		return this.ownerList;
	}

}
