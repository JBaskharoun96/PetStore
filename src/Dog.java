/* Author: Jonathan Baskharoun
 * Date: 03/16/2022
 * Version: Java 1.8
 * The Dog class implements the Pet interface, Comparable<Dog> interface, and 
 * sets up functionality which will be common to all concrete subclasses
 */

public abstract class Dog implements Comparable<Dog>, Pet {
	
	private boolean spayNeuter;
	private int dogAge;
	private int dogWeight;
	private String dogBreed;
	private String dogName;

	
	// Constructor
	public Dog(boolean spayNeuter, int dogAge, 
			int dogWeight, String dogBreed, String dogName) {

		this.spayNeuter = spayNeuter;
		this.dogAge = dogAge;
		this.dogWeight = dogWeight;
		this.dogBreed = dogBreed;
		this.dogName = dogName;
	}
	

	@Override
	public int compareTo(Dog other) {
		
		// Sorting by age first
		if (this.getDogAge() < other.getDogAge() ) {
			return -1;
		}
		else if (this.getDogAge() > other.getDogAge() ) {
			return 1;
		}
		
		// Sorting by weight second
		if (this.getDogWeight() < other.getDogWeight() ) {
			return -1;
		}
		else if (this.getDogWeight() > other.getDogWeight() ) {
			return 1;
		}
		
		// Sorting by name last
		if (this.getDogName().compareTo(other.getDogName() ) == 1) {
			return 1;
		}
		else if (this.getDogName().compareTo(other.getDogName() ) == -1) {
			return -1;
		}
		
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "Class: " + this.getClass().getName() + "%n" +
			   "Name: " + getDogName() + "%n" +
			   "Breed: " + getDogBreed() + "%n" +
			   "Age: " + getDogAge() + " years%n" +
			   "Weight: " + getDogWeight() + " pounds%n" + 
			   "Spay/Neuter: " + isSpayNeuter() + "%n";
	}
	
	
	@Override
	public void eat(int numOunces) {

		System.out.printf("Your dog %s has eaten %d ounces of food%n", this.getDogName(), numOunces);
		
		return;
	}

	
	@Override
	public void sleep(int numHours) {

		System.out.printf("Your dog %s gets %d hours of restful sleep%n", this.getDogName(), numHours);
		
		return;
	}

	
	@Override
	public void run(int numFeet) {

		System.out.printf("Your dog %s runs %d feet as exercise%n", this.getDogName(), numFeet);
		
		return;
	}

	
	// Getters and Setters
	
	public boolean isSpayNeuter() {
		return spayNeuter;
	}

	public void setSpayNeuter(boolean spayNeuter) {
		this.spayNeuter = spayNeuter;
	}

	public int getDogAge() {
		return dogAge;
	}


	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}


	public int getDogWeight() {
		return dogWeight;
	}

	public void setDogWeight(int dogWeight) {
		this.dogWeight = dogWeight;
	}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

}
