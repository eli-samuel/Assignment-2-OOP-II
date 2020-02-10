package MAV;

import UAV.UAV;

public class AgriculturalDrone extends UAV {

    private String brand;
    private int carryCapacity;

	/**
	* Default empty AgriculturalDrone constructor
	*/
	public AgriculturalDrone() {
		super();
		brand = "";
		carryCapacity = 1;
	}

	/**
	* Default AgriculturalDrone constructor
	*/
	public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
		super(weight, price);
		this.brand = brand;
		this.carryCapacity = carryCapacity;
	}
	
	/**
	* AgriculturalDrone copy constructor
	*
	* @param A an AgriculturalDrone object
	*/
	public AgriculturalDrone(AgriculturalDrone A){
		super(UAV);
		this.brand = A.brand;
		this.carryCapacity = A.carryCapacity;
	}

	/**
	* Returns value of brand
	* @return
	*/
	public String getBrand() {
		return brand;
	}

	/**
	* Sets new value of brand
	* @param
	*/
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	* Returns value of carryCapacity
	* @return
	*/
	public int getCarryCapacity() {
		return carryCapacity;
	}

	/**
	* Sets new value of carryCapacity
	* @param
	*/
	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else if (getClass() != obj.getClass()) return false;
		else {
			AgriculturalDrone other = (AgriculturalDrone) obj;
			return (brand.equals(other.brand) && carryCapacity == other.carryCapacity);
		}
	}

	/**
	* Create string representation of AgriculturalDrone for printing
	* @return
	*/
	@Override
	public String toString() {
		return "AgriculturalDrone [brand=" + brand + ", carryCapacity=" + carryCapacity + "]";
	}
}
