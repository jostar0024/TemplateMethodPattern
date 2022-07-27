
public abstract class AbstractCalculater {
	public abstract void start();
	public abstract void calculate();
	public abstract void end();
	
	public final void show() {
		start();
		calculate();
		end();
	}
}
