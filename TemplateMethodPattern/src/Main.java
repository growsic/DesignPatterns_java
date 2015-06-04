/*test Template Method*/
public class Main {
	
	public static void main(String[] args) {
		//init CharDisplay and StringDisplay, which extend AbstractDisplay
		AbstractDisplay d1 = new CharDisplay('h');
		AbstractDisplay d2 = new StringDisplay("hello");
		
		//call display method
		d1.display();
		d2.display();
	}

}
