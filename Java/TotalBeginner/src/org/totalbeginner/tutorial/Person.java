package org.totalbeginner.tutorial;

public class Person {
	// fields
	private String name;	// name of person
	private int maximumBooks;	// most books this person can check out
	
	// constructors
	public Person () {
		name = "unknown";
		maximumBooks = 3;
	}
	
	// methods
	public String getName() {
		return name;
	}
	
	public void setName(String anyName) {
		name = anyName;
	}
	
	public int getMaximumBooks() {
		return maximumBooks;
	}
	
	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
}
