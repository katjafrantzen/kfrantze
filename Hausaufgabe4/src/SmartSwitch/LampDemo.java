package SmartSwitch;

public class LampDemo {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		lamp.turnOn();
		lamp.setBrightness(80);
		lamp.dimToHalf();
		System.out.println("Brightness: " + lamp.getBrightness());
	}

}
