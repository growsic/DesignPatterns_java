
public class IDCard extends Product {
	
	private String ownersName;
	private int idNumber;
	//this constructor is called only within the same package
	 IDCard(String name, int id) {
		this.ownersName = name;
		this.idNumber = id;
	}

	@Override
	public void use() {
		System.out.println(this.ownersName + ":" + this.idNumber + ": this card is used.");	
	}
	
	public String getOwner() {
		return this.ownersName;
	}

}
