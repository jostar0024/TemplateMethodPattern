
public class DoubleCalculater extends AbstractCalculater {
	private double m_num;
	DoubleCalculater(double num) {
		this.m_num = num;
	}
	
	@Override
	public void start() {
		System.out.println("+++start+++");		
	}

	@Override
	public void calculate() {
		System.out.println(m_num * m_num * m_num);		
	}

	@Override
	public void end() {
		System.out.println("++++end++++");		
		
	}

}
