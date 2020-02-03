public class Multirotor extends Helicopter {

    private int numRotors;

	/**
	* Default empty Multirotor constructor
	*/
	public Multirotor() {
		super();
	}

	/**
	* Default Multirotor constructor
	*/
	public Multirotor(int numRotors) {
		super();
		this.numRotors = numRotors;
	}

	/**
	* Returns value of numRotors
	* @return
	*/
	public int getNumRotors() {
		return numRotors;
	}

	/**
	* Sets new value of numRotors
	* @param
	*/
	public void setNumRotors(int numRotors) {
		this.numRotors = numRotors;
	}

	/**
	* Create string representation of Multirotor for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Multirotor [numRotors=" + numRotors + "]";
	}
}
