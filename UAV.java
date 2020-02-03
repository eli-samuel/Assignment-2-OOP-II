public class UAV {

    private double weight;
    private double price;

	/**
	* Default empty UAV constructor
	*/
	public UAV() {
		super();
	}

	/**
	* Default UAV constructor
	*/
	public UAV(double weight, double price) {
		super();
		this.weight = weight;
		this.price = price;
	}

	/**
	* Returns value of weight
	* @return
	*/
	public double getWeight() {
		return weight;
	}

	/**
	* Sets new value of weight
	* @param
	*/
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	* Returns value of price
	* @return
	*/
	public double getPrice() {
		return price;
	}

	/**
	* Sets new value of price
	* @param
	*/
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	* Create string representation of UAV for printing
	* @return
	*/
	@Override
	public String toString() {
		return "UAV [weight=" + weight + ", price=" + price + "]";
	}
}
