public class AgriculturalDrone extends UAV {

    private String brand;
    private int carryCapacity;

	/**
	* Default empty AgriculturalDrone constructor
	*/
	public AgriculturalDrone() {
		super();
	}

	/**
	* Default AgriculturalDrone constructor
	*/
	public AgriculturalDrone(String brand, int carryCapacity) {
		super();
		this.brand = brand;
		this.carryCapacity = carryCapacity;
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

	/**
	* Create string representation of AgriculturalDrone for printing
	* @return
	*/
	@Override
	public String toString() {
		return "AgriculturalDrone [brand=" + brand + ", carryCapacity=" + carryCapacity + "]";
	}
}
