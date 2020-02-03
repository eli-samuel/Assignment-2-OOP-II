public class MAV extends UAV {

    private String model;
    private double size;

	/**
	* Default empty MAV constructor
	*/
	public MAV() {
		super();
	}

	/**
	* Default MAV constructor
	*/
	public MAV(String model, double size) {
		super();
		this.model = model;
		this.size = size;
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

	/**
	* Create string representation of MAV for printing
	* @return
	*/
	@Override
	public String toString() {
		return "MAV [model=" + model + ", size=" + size + "]";
	}
}
