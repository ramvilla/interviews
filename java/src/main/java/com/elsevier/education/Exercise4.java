package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

Counter is not thread safe , the way to fix it is including synchronized keyword.

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public int increment() {
			 synchronized(this){
				return ++count;
			}
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			 synchronized(this){
				count = 0;
			 }
		}

	}
}
