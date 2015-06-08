import java.util.ArrayList;
import java.util.List;


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
