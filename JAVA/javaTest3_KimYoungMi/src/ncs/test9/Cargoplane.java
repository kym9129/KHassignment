package ncs.test9;

public class Cargoplane extends Plane {

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		//운항
		//일정 거리만큼 운항 시 연료 감소
		//10 운항 시 연료 50 감소
		super.fuelSize -= (distance * 5);
	}

}
