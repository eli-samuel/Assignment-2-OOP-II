package Main;

import Airplane.Airplane;
import Helicopter.Helicopter;
import Helicopter.Quadcopter;
import MAV.AgriculturalDrone;
import MAV.MAV;
import Multirotor.Multirotor;
import UAV.UAV;
import FlyingObject.FlyingObject;

public class Assignment2 {

	public static FlyingObject[] copyFlyingObjects(FlyingObject[] a) {
		FlyingObject[] b = new FlyingObject[a.length];
		for (int i = 0; i < a.length; i++) { // because data lost etc, thats why we need to use clone() method
		b[i] = a[i].make(); // Problem here!
		b[i].setPrice(b[i].getPrice()+1);
			//b[i] = (Airplane) a[i].clone(); // Solution!
		}
		return b;
	}

	public static void main(String[] args) {

		Airplane a1 = new Airplane("CoolBrand", 1000000, 1500);
		Helicopter h1 = new Helicopter("HelicoptersArentPlanes", 2000000, 200, 8, 2000, 4);
		Quadcopter q1 = new Quadcopter("BasicBrand", 100000, 50, 2, 2018, 2, 150);
		Quadcopter q2 = new Quadcopter("BasicBrand", 100000, 50, 2, 2018, 2, 150);
		AgriculturalDrone ad1 = new AgriculturalDrone(50, 3000, "DroneBrand", 5);
		AgriculturalDrone ad2 = new AgriculturalDrone(ad1);
		MAV mav1 = new MAV(5, 150, "LameModel", 15);
		MAV mav2 = new MAV(2, 300, "CoolModel", 20);
		Multirotor m1 = new Multirotor("OtherBrand", 200000, 60, 4, 1990, 8, 2);
		UAV uav1 = new UAV(50, 500000);

		//Printing info
		System.out.println(a1);
		System.out.println(h1);
		System.out.println(q1);
		System.out.println(q1);
		System.out.println(ad1);
		System.out.println(mav1);
		System.out.println(m1);
		System.out.println(uav1);

		// Testing equals method
		System.out.println(h1.equals(a1));		// false
		System.out.println(a1.equals(h1));		// false
		System.out.println(ad1.equals(ad2));	// true
		System.out.println(q1.equals(q2));		// true
		System.out.println(mav2.equals(mav1));	// false

		// Creating an array of objects
		FlyingObject[] flyingObjects = {
				a1, h1, q1, q2, ad1, ad2, mav1, mav2, m1, uav1
		};

		double smallest = Double.MAX_VALUE;
		double secondSmallest = Double.MAX_VALUE;
		int index1=0, index2=0;
		for (int i = 0; i < flyingObjects.length; i++) {
			if (flyingObjects[i].getPrice() < smallest) {
				secondSmallest = smallest;
				smallest = flyingObjects[i].getPrice();
				index1 = i;
	        }
			else if (flyingObjects[i].getPrice() < secondSmallest) {
				secondSmallest = flyingObjects[i].getPrice();
				index2 = i;
			}
		}

		System.out.println("Index in array: " + index1 + ". Information: " + flyingObjects[index1]); // 150
		System.out.println("Index in array: " + index2 + ". Information: " + flyingObjects[index2]); // 300

		// Try to copy the array
		FlyingObject[] flyingObjectsCopy = copyFlyingObjects(flyingObjects);

		for (int i = 0; i < flyingObjectsCopy.length; i++) {
			System.out.println("Original array: " + flyingObjects[i]);
			System.out.println("Copied array: " + flyingObjectsCopy[i]);
		}
	}

}
