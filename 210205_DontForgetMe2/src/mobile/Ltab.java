package mobile;

public class Ltab extends Mobile {

	public Ltab() {
		super();
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	@Override
	public int operate(int time) {
		return batterySize = batterySize - (10 * time);
	}
	
	@Override
	public int charge(int time) {
		return batterySize = batterySize + (10 * time);
	}
	
	

}
