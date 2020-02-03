public class Helicopter extends Airplane {

    private int numCylinders;
    private int creationYear;
    private int passengerCapacity;

	/**
	* Default empty Helicopter constructor
	*/
	public Helicopter() {
		super();
	}

	/**
	* Default Helicopter constructor
	*/
	public Helicopter(int numCylinders, int creationYear, int passengerCapacity) {
		super();
		this.numCylinders = numCylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}

	/**
	* Returns value of numCylinders
	* @return
	*/
	public int getNumCylinders() {
		return numCylinders;
	}

	/**
	* Sets new value of numCylinders
	* @param
	*/
	public void setNumCylinders(int numCylinders) {
		this.numCylinders = numCylinders;
	}

	/**
	* Returns value of creationYear
	* @return
	*/
	public int getCreationYear() {
		return creationYear;
	}

	/**
	* Sets new value of creationYear
	* @param
	*/
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	/**
	* Returns value of passengerCapacity
	* @return
	*/
	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	/**
	* Sets new value of passengerCapacity
	* @param
	*/
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	/**
	* Create string representation of Helicopter for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Helicopter [numCylinders=" + numCylinders + ", creationYear=" + creationYear + ", passengerCapacity=" + passengerCapacity + "]";
	}
}
