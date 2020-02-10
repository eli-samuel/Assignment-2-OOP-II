package Helicopter;

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
	public Quadcopter(String brand, double price, int horsePower, int numCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
		super(brand, price, horsePower, numCylinders, creationYear, passengerCapacity);
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
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else if (getClass() != obj.getClass()) return false;
		else {
			Quadcopter other = (Quadcopter) obj;
			return (maxFlyingSpeed == other.maxFlyingSpeed);
		}
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
