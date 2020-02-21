package FlyingObject;

public class FlyingObject {
	
	protected double price;
	
	public FlyingObject() {
		price = 0;
	}
	
	public FlyingObject(double price) {
		this.price = price;
	}
	
	public FlyingObject(FlyingObject f) {
		this.price = f.price;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "This flying object costs $" + price;
	}

}
