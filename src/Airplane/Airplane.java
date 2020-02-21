package Airplane;

import FlyingObject.FlyingObject;

public class Airplane extends FlyingObject {

    protected String brand;
    protected int horsePower;

	/**
	* Default empty Airplane constructor
	*/
	public Airplane() {
		super();
		brand = "";
		horsePower = 1;
	}

	/**
	* Default Airplane constructor
	*
	* @param brand a string variable
	* @param price a double variable
	* @param horsePower a integer variable
	*/
	public Airplane(String brand, double price, int horsePower) {
		super(price);
		this.brand = brand;
		this.horsePower = horsePower;
	}
	/**
	* Copy constructor
	*
	* @param p an Airplane object
	*/
	public Airplane(Airplane p){
		super((FlyingObject) p);
		this.brand = p.brand;
		this.horsePower = p.horsePower;
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
	* Returns value of horsePower
	* @return
	*/
	public int getHorsePower() {
		return horsePower;
	}

	/**
	* Sets new value of horsePower
	* @param
	*/
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	/**
	 *
	 */
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else if (getClass() != obj.getClass()) return false;
		else {
			Airplane other = (Airplane) obj;
			return (brand == other.brand && price == other.price && horsePower == other.horsePower);
		}
	}

	/**
	* Create string representation of Airplane for printing
	* @return
	*/
	public String toString() {
		return "This airplane is manufactured by " + brand + ", the selling price is " + price + ", and it has " + horsePower + " horsepower.";
	}

}
