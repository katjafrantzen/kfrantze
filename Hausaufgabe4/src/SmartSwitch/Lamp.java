package SmartSwitch;

public class Lamp implements Switchable, Dimmable {

	private boolean on;
	private int brightness;

	@Override
	public void setBrightness(int level) {
		if (on && level > 0 && level <= MAX_BRIGHTNESS) {
			brightness = level;
		}
	}

	@Override
	public int getBrightness() {
		return brightness;
	}

	@Override
	public void dimToHalf() {
		brightness = MAX_BRIGHTNESS / 2;

	}

	@Override
	public void turnOn() {
		on = true;

	}

	@Override
	public void turnOff() {
		on = false;

	}

	@Override
	public boolean isOn() {
		return on;
	}

}
