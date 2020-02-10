package Main;

import Airplane.Airplane;
import Helicopter.*;
import MAV.*;
import Multirotor.Multirotor;
import UAV.UAV;

public class Assignment2 {
	
	public static Airplane[] copyFlyingObjects(Airplane[] a) {
		Airplane[] b = new Airplane[a.length];
		for (int i = 0; i < a.length; i++) {
		//b[i] = new Sale(a[i]); // Problem here!
			//b[i] = (Airplane) a[i].clone(); // Solution!
		}
		return a;
	}

	public static void main(String[] args) {

		System.out.println(new Airplane());
		System.out.println(new Helicopter());
		System.out.println(new Quadcopter());
		System.out.println(new AgriculturalDrone());
		System.out.println(new MAV());
		System.out.println(new Multirotor());
		System.out.println(new UAV());
		
		Object[] objects = {
				new Airplane(), new Helicopter(), new Quadcopter(),
				new AgriculturalDrone(), new MAV(), new Multirotor(),
				new UAV(), new Airplane(), new Helicopter(), new Quadcopter(),
				new AgriculturalDrone(), new MAV(), new Multirotor(),
				new UAV(), new Airplane(), new Helicopter(), new Quadcopter()
		};
		
		System.out.println(objects.length);

	}

}
