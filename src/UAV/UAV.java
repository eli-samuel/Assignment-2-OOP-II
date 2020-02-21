package UAV;

import FlyingObject.FlyingObject;

public class UAV extends FlyingObject {

    protected double weight;

	/**
	* Default empty UAV constructor
	*/
	public UAV() {
		super();
		weight = 1;
	}

	/**
	* Default UAV constructor
	*/
	public UAV(double weight, double price) {
		super(price);
		this.weight = weight;
	}

	/**
	* UAV copy constructor
	*
	* @param u a UAV object
	*/
	public UAV(UAV u){
		super((FlyingObject) u);
		this.weight = u.weight;
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
		return "This UAV weighs " + weight +" kg" + " and costs $" + price;
	}

}
