package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine;
		
		public Car() {
		}
		
		public Car(GasEngine gasEngine){
			this.gasEngine = gasEngine;	
		}
		
		public car(
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine {
		private static GasEngine gasObj;
		
		public GasEngine(){
			this.gasObj = new GasEngine();	
		}
		
		Car car = new Car(gasObj);
		
		car.moveForward();
			
		public void spinWheels() {
			System.out.println("Sping Gas Engine wheels");
		}
	}
}
