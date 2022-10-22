/* Author: Jonathan Baskharoun
 * Date: 03/16/2022
 * Version: Java 1.8
 * The Rabbit class implements the Pet interface, Comparable<Rabbit> interface,
 * and sets up functionality which will be common to all concrete subclasses
 */

public abstract class Rabbit implements Comparable<Rabbit>, Pet {
	
	private boolean spayNeuter;
	private int rabbitAge;
	private int rabbitWeight;
	private String rabbitBreed;
	private String rabbitName;
	

	// Constructor
	public Rabbit(boolean spayNeuter, int rabbitAge, 
			int rabbitWeight, String rabbitBreed, String rabbitName) {

		this.spayNeuter = spayNeuter;
		this.rabbitAge = rabbitAge;
		this.rabbitWeight = rabbitWeight;
		this.rabbitBreed = rabbitBreed;
		this.rabbitName = rabbitName;
	}


	@Override
	public int compareTo(Rabbit other) {
		
		// Sorting by age first
		if (this.getRabbitAge() < other.getRabbitAge() ) {
			return -1;
		}
		else if (this.getRabbitAge() > other.getRabbitAge() ) {
			return 1;
		}
		
		// Sorting by weight second
		if (this.getRabbitWeight() < other.getRabbitWeight() ) {
			return -1;
		}
		else if (this.getRabbitWeight() > other.getRabbitWeight() ) {
			return 1;
		}
		
		// Sorting by name last
		if (this.getRabbitName().compareTo(other.getRabbitName() ) == 1) {
			return 1;
		}
		else if (this.getRabbitName().compareTo(other.getRabbitName() ) == -1) {
			return -1;
		}
		
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "Class: " + this.getClass().getName() + "%n" +
			   "Name: " + getRabbitName() + "%n" +
			   "Breed: " + getrabbitBreed() + "%n" +
			   "Age: " + getRabbitAge() + " years%n" +
			   "Weight: " + getRabbitWeight() + " pounds%n" + 
			   "Spay/Neuter: " + isSpayNeuter() + "%n";
	}
	
	
	@Override
	public void eat(int numOunces) {

		System.out.printf("Your rabbit %s has eaten %d ounces of food%n", this.getRabbitName(), numOunces);
		
		return;
	}

	
	@Override
	public void sleep(int numHours) {

		System.out.printf("Your rabbit %s gets %d hours of restful sleep%n", this.getRabbitName(), numHours);
		
		return;
	}

	
	@Override
	public void run(int numFeet) {

		System.out.printf("Your rabbit %s runs %d feet as exercise%n", this.getRabbitName(), numFeet);
		
		return;
	}


	// Getters and Setters
	
	public boolean isSpayNeuter() {
		return spayNeuter;
	}

	public void setSpayNeuter(boolean spayNeuter) {
		this.spayNeuter = spayNeuter;
	}

	public int getRabbitAge() {
		return rabbitAge;
	}


	public void setRabbitAge(int rabbitAge) {
		this.rabbitAge = rabbitAge;
	}


	public int getRabbitWeight() {
		return rabbitWeight;
	}

	public void setRabbitWeight(int rabbitWeight) {
		this.rabbitWeight = rabbitWeight;
	}

	public String getrabbitBreed() {
		return rabbitBreed;
	}

	public void setrabbitBreed(String rabbitBreed) {
		this.rabbitBreed = rabbitBreed;
	}

	public String getRabbitName() {
		return rabbitName;
	}

	public void setRabbitName(String rabbitName) {
		this.rabbitName = rabbitName;
	}

}
