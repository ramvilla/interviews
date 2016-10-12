package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton obj;
		
		static {
			obj = new Singleton();
		}
		
		private Singleton(){
			//do nothing	
		}
		
		private static Singleton getInstance(){
			return obj;	
		}
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = getInstance();
		st.doSomeThing();
	}
}
