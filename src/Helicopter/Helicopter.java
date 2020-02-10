package Helicopter;

import Airplane.Airplane;

public class Helicopter extends Airplane {

    private int numCylinders;
    private int creationYear;
    private int passengerCapacity;

	/**
	* Default empty Helicopter constructor
	*/
	public Helicopter() {
		super();
		numCylinders = 1;
		creationYear = 1900;
		passengerCapacity = 1;
	}

	/**
	* Default Helicopter constructor
	*/
	public Helicopter(String brand, double price, int horsePower, int numCylinders, int creationYear, int passengerCapacity) {
		super(brand, price, horsePower);
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
	

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else if (getClass() != obj.getClass()) return false;
		else {
			Helicopter other = (Helicopter) obj;
			return (numCylinders == other.numCylinders && creationYear == other.creationYear && passengerCapacity == other.passengerCapacity);
		}
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
