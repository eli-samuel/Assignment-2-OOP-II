public class Airplane {

    private String brand;
    private double price;
    private int horsePower;

	/**
	* Default empty Airplane constructor
	*/
	public Airplane() {
		super();
	}

	/**
	* Default Airplane constructor
	*/
	public Airplane(String brand, double price, int horsePower) {
		super();
		this.brand = brand;
		this.price = price;
		this.horsePower = horsePower;
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
	* Create string representation of Airplane for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Airplane [brand=" + brand + ", price=" + price + ", horsePower=" + horsePower + "]";
	}
}
