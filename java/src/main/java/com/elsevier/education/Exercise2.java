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
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine {
			
		public void spinWheels() {
			System.out.println("Sping Gas Engine wheels");
		}
	}
}
