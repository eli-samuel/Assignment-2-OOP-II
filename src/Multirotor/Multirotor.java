package Multirotor;

import Helicopter.Helicopter;

public class Multirotor extends Helicopter {

    private int numRotors;

	/**
	* Default empty Multirotor constructor
	*/
	public Multirotor() {
		super();
		numRotors = 1;
	}

	/**
	* Default Multirotor constructor
	*/
	public Multirotor(String brand, double price, int horsePower, int numCylinders, int creationYear, int passengerCapacity, int numRotors) {
		super(brand, price, horsePower, numCylinders, creationYear, passengerCapacity);
		this.numRotors = numRotors;
	}

	/**
	* Returns value of numRotors
	* @return
	*/
	public int getNumRotors() {
		return numRotors;
	}

	/**
	* Sets new value of numRotors
	* @param
	*/
	public void setNumRotors(int numRotors) {
		this.numRotors = numRotors;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else if (getClass() != obj.getClass()) return false;
		else {
			Multirotor other = (Multirotor) obj;
			return (numRotors == other.numRotors);
		}
	}

	/**
	* Create string representation of Multirotor for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Multirotor [numRotors=" + numRotors + "]";
	}
}
