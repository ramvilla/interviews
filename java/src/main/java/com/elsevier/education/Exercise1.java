package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
//making class as final
public final class Exercise1 {

	public static class Person {
		//seeting the data member as final and removing the setter method
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person() {
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		/*public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}*/
		
		public String getFirstName() {
			return firstName;
		}
		/*public void setFirstName(String newName) {
			firstName = newName;
		}*/
		
		public String getLastName() {
			return lastName;
		}
		/*public void setLastName(String newName) {
			lastName = newName;
		}*/
	}
}
