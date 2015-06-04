
public abstract class AbstractDisplay {
	
	//abstract methods whitch is called in display method
	protected abstract void open();
	protected abstract void print();
	protected abstract void close();
	
	private final int MAX_COUNT = 5;
	
	//this method won't be modified
	public final void display() {
		open();
		for(int i = 0; i < MAX_COUNT; i++) {
			print();
		}
		close();
	}
}
