package ncs.test9;

public class Airplane extends Plane {

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		//운항
		//일정 거리만큼 운항 시 연료 감소
		//10 운항 시 연료 30 감소
		super.fuelSize -= (distance * 3);
	}

}
