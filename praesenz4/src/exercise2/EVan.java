package exercise2;

public class EVan extends Vehicle implements Electrified {

	// TODO: add attributes , constants and implement required methods
	public EVan(String id, double maxLoad, double batteryCapacity) {
		super(id, maxLoad);
		// TODO: initialise attributes
	}
	// TODO: implement Vehicle + Electrified methods

	@Override
	public void charge(double kWh) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getBatteryLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getRange() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double fuelNeeded(double distance) {
		// TODO Auto-generated method stub
		return 0;
	}

}
