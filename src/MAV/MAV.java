package MAV;

import UAV.UAV;

public class MAV extends UAV {

    private String model;
    private double size;

	/**
	* Default empty MAV constructor
	*/
	public MAV() {
		super();
		model = "";
		size = 1;
	}

	/**
	* Default MAV constructor
	*/
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}

	/**
	* MAV copy constructor
	*
	* @param Ma an MAV object
	*/
	public MAV(MAV Ma){
		super((UAV) Ma);
		this.model = Ma.model;
		this.size = Ma.size;
	}

	/**
	* Returns value of model
	* @return
	*/
	public String getModel() {
		return model;
	}

	/**
	* Sets new value of model
	* @param
	*/
	public void setModel(String model) {
		this.model = model;
	}

	/**
	* Returns value of size
	* @return
	*/
	public double getSize() {
		return size;
	}

	/**
	* Sets new value of size
	* @param
	*/
	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else if (getClass() != obj.getClass()) return false;
		else {
			MAV other = (MAV) obj;
			return (model.equals(other.model) && size == other.size);
		}
	}

	/**
	* Create string representation of MAV for printing
	* @return
	*/
	@Override
	public String toString() {
		return "This MAV is the " + model + " model, it has a diameter of " + size + " cm. It weighs " + weight +" kg " + " and costs $" + price;
	}
	
}
