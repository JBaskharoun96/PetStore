/* Author: Jonathan Baskharoun
 * Date: 03/16/2022
 * Version: Java 1.8
 * The Cat class implements the Pet interface, Comparable<Cat> interface, and 
 * sets up functionality which will be common to all concrete subclasses
 */

public abstract class Cat implements Comparable<Cat>, Pet {
	
	private boolean spayNeuter;
	private int catAge;
	private int catWeight;
	private String catBreed;
	private String catName;
	
	
	// Constructor
	public Cat(boolean spayNeuter, int catAge, 
			int catWeight, String catBreed, String catName) {

		this.spayNeuter = spayNeuter;
		this.catAge = catAge;
		this.catWeight = catWeight;
		this.catBreed = catBreed;
		this.catName = catName;
	}


	@Override
	public int compareTo(Cat other) {
		
		// Sorting by age first
		if (this.getCatAge() < other.getCatAge() ) {
			return -1;
		}
		else if (this.getCatAge() > other.getCatAge() ) {
			return 1;
		}
		
		// Sorting by weight second
		if (this.getCatWeight() < other.getCatWeight() ) {
			return -1;
		}
		else if (this.getCatWeight() > other.getCatWeight() ) {
			return 1;
		}
		
		// Sorting by name last
		if (this.getCatName().compareTo(other.getCatName() ) == 1) {
			return 1;
		}
		else if (this.getCatName().compareTo(other.getCatName() ) == -1) {
			return -1;
		}
		
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "Class: " + this.getClass().getName() + "%n" +
			   "Name: " + getCatName() + "%n" +
			   "Breed: " + getCatBreed() + "%n" +
			   "Age: " + getCatAge() + " years%n" +
			   "Weight: " + getCatWeight() + " pounds%n" + 
			   "Spay/Neuter: " + isSpayNeuter() + "%n";
	}
	
	
	@Override
	public void eat(int numOunces) {

		System.out.printf("Your cat %s has eaten %d ounces of food%n", this.getCatName(), numOunces);
		
		return;
	}

	
	@Override
	public void sleep(int numHours) {

		System.out.printf("Your cat %s gets %d hours of restful sleep%n", this.getCatName(), numHours);
		
		return;
	}

	
	@Override
	public void run(int numFeet) {
		
		System.out.printf("Your cat %s runs %d feet as exercise%n", this.getCatName(), numFeet);
		
		return;
	}
	
	
	// Getters and Setters

	public boolean isSpayNeuter() {
		return spayNeuter;
	}

	public void setSpayNeuter(boolean spayNeuter) {
		this.spayNeuter = spayNeuter;
	}

	
	// Getters and Setters

	public int getCatAge() {
		return catAge;
	}


	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}


	public int getCatWeight() {
		return catWeight;
	}

	public void setCatWeight(int catWeight) {
		this.catWeight = catWeight;
	}

	public String getCatBreed() {
		return catBreed;
	}

	public void setCatBreed(String catBreed) {
		this.catBreed = catBreed;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

}
