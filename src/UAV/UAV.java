package UAV;

public class UAV {

    private double weight;
    private double price;

	/**
	* Default empty UAV constructor
	*/
	public UAV() {
		weight = 1;
		price  = 1;
	}

	/**
	* Default UAV constructor
	*/
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}
	
	/**
	* UAV copy constructor
	*
	* @param u a UAV object
	*/
	public UAV(UAV u){
		this.weight = u.weight;
		this.price = u.price;
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
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else if (getClass() != obj.getClass()) return false;
		else {
			UAV other = (UAV) obj;
			return (weight == other.weight && price == other.price);
		}
	}

	/**
	* Create string representation of UAV for printing
	* @return
	*/
	@Override
	public String toString() {
		return "This UAV weighs" + weight +"Kg" + "and costs $" + price;
	}
}
