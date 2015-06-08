import java.util.List;


public class Main {

	public static void main(String[] args) {
		Factory idCardFactory = new IDCardFactory();
		Product card1 = idCardFactory.create("Tanaka");
		Product card2 = idCardFactory.create("Saito");
		Product card3 = idCardFactory.create("Minami");
		List ownersList = ((IDCardFactory) idCardFactory).getOwners();
		
		//owner's name and cardId will be printed
		card1.use();
		card2.use();
		card3.use();
	}

}
