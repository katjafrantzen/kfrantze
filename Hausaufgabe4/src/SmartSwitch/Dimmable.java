package SmartSwitch;

public interface Dimmable {

	final int MAX_BRIGHTNESS = 100;
	
	/**
	 * @param level must be between 0 and MAX_BRIGHTNESS
	 */
	void setBrightness(int level);
	int getBrightness();
	
	/**
	 * sets brightness to MAX_BRIGHTNESS / 2
	 */
	void dimToHalf();
	
}
