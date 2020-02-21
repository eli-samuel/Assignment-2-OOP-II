package Helicopter;

import Airplane.Airplane;

public class Helicopter extends Airplane {

    protected int numCylinders;
    protected int creationYear;
    protected int passengerCapacity;

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
	* Copy contructor
	*
	* @param H a Helicopter object
	*/
	public Helicopter(Helicopter H){
		super((Airplane) H); // DOES THIS WORK?
		this.numCylinders = H.numCylinders;
		this.creationYear = H.creationYear;
		this.passengerCapacity = H.passengerCapacity;
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
		return "This helicopter has " + numCylinders + " cylinders, and was created in " + creationYear + ". It holds " + passengerCapacity + " passengers, it is manufactured by " + brand + ", the selling price is " + price + ", and it has " + horsePower + " horsepower.";
	}
	
}
