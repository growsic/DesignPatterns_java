
public class Banner {
	//field
	private String string;
	
	public Banner(String string) {
		this.string = string;
	}
	
	public void showWithPattern() {
		System.out.println("(" + this.string + ")");
	}
	
	public void showWithAster() {
		System.out.println("*" + this.string + "*");
	}
}
