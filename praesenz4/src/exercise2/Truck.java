package exercise2;

public class Truck extends Vehicle implements Refuelable {
	
	String id;
	double maxLoad;
	double tankCapacity;
	
	public Truck(String id, double maxLoad, double tankCapacity) {
		super(id, maxLoad);
		this.id = id;
		this.maxLoad = maxLoad;
		this.tankCapacity = tankCapacity;
	}
	// TODO: implement Vehicle + Refuelable methods

	@Override
	public void refuel(double liters) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getFuelLevel() {
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
