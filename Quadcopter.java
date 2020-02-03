public class Quadcopter extends Helicopter {

    private int maxFlyingSpeed;

	/**
	* Default empty Quadcopter constructor
	*/
	public Quadcopter() {
		super();
	}

	/**
	* Default Quadcopter constructor
	*/
	public Quadcopter(int maxFlyingSpeed) {
		super();
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	/**
	* Returns value of maxFlyingSpeed
	* @return
	*/
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}

	/**
	* Sets new value of maxFlyingSpeed
	* @param
	*/
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	/**
	* Create string representation of Quadcopter for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Quadcopter [maxFlyingSpeed=" + maxFlyingSpeed + "]";
	}
}
