/* Author: Jonathan Baskharoun
 * Date: 03/16/2022
 * Version: Java 1.8
 * The Pet interface lays out the method declarations for derived pet classes
 */

public interface Pet {
	
	public abstract void eat(int numOunces);
	
	public abstract void sleep(int numHours);
	
	public abstract void run(int numFeet);
	
}
