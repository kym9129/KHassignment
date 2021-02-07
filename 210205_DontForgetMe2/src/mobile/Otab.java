package mobile;

public class Otab extends Mobile {

	public Otab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int operate(int time) {
		return batterySize -= (time * 12);
	}
	
	@Override
	public int charge(int time) {
		return batterySize += (time * 8);
	}

}
