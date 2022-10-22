import java.util.ArrayList;
import java.util.Scanner;

/* Author: Jonathan Baskharoun
 * Date: 03/16/2022
 * Version: Java 1.8
 * The PetDriver class manages Pet objects and program control flow
 * Holds a list for each type of abstract pet and menu allows viewing
 */

public class PetDriver {

	public static void main(String[] args) {

		int optionKey = 0;
		int animalSelect = 0;

		Scanner scnr = new Scanner(System.in);

		// Creating a list based on each abstract class, using polymorphism
		// to add different types of each animal to the same list
		ArrayList<Cat> catList = new ArrayList<Cat>();
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		ArrayList<Rabbit> rabbitList = new ArrayList<Rabbit>();

		// Cat Inventory
		catList.add(new Cat_Bengal(true, 4, 8, "Bengal", "Bengy") );
		catList.add(new Cat_MaineCoon(true, 5, 16, "Maine Coon", "Big Jeff") );
		catList.add(new Cat_MaineCoon(true, 12, 18, "Maine Coon", "Tubbs") );
		catList.add(new Cat_MaineCoonTabby(true, 3, 10, "Main Coon Tabby", "Pepper") );
		catList.add(new Cat_MaineCoonTabby(true, 2, 8, "Maine Coon Tabby", "Slip") );

		// Dog Inventory
		dogList.add(new Dog_Collie(true, 8, 32, "Collie", "Maggie") );
		dogList.add(new Dog_Collie(true, 4, 25, "Collie", "Maximillian") );
		dogList.add(new Dog_CollieAkita(true, 10, 36, "Collie Akita", "Samuel") );
		dogList.add(new Dog_GermanShepherd(true, 1, 28, "German Shepherd", "The Flash") );
		dogList.add(new Dog_GermanShepherd(true, 16, 120, "German Shepherd", "Kratos") );

		// Rabbit Inventory
		rabbitList.add(new Rabbit_Amami(true, 2, 2, "Amami", "Mr. Hops") );
		rabbitList.add(new Rabbit_American(true, 4, 3, "American", "Jumping Jack") );
		rabbitList.add(new Rabbit_American(true, 1, 2, "American", "Buster") );
		rabbitList.add(new Rabbit_AmericanChinchilla(true, 3, 2, "American Chinchilla", "Brownie") );


		// Welcome
		System.out.println("Welcome to the pet store");

		do { // Main menu

			System.out.printf("%nHere are your options: %n%n");
			System.out.println("0. Exit");
			System.out.println();
			System.out.println("1. View available cats");
			System.out.println("2. View available dogs");
			System.out.println("3. View available rabbits");
			System.out.println();
			System.out.println("4. Cat comparisons");
			System.out.println("5. Dog comparisons");
			System.out.println("6. Rabbit comparisons");

			System.out.printf("%nEnter a number to select an option: ");
			
			while (!scnr.hasNextInt() ) { // Selecting menu options
				
				scnr.next();
				System.out.printf("%nEnter a number to select an option: ");
			}

			optionKey = scnr.nextInt();

			// Switch controls flow for menu options
			switch(optionKey) {

			case 0: // Exits
				break;

			case 1: // Displays cats and user selects one to view details of

				System.out.println("Here are some cats");
				System.out.println();

				// Displaying cats by name to start with
				for (int i = 0; i < catList.size(); i++) {
					System.out.println( (i + 1) + ". " + catList.get(i).getCatName() );
				}

				do { // Selecting a particular cat

					System.out.printf("%nEnter a number to see more details: ");
					animalSelect = scnr.nextInt() - 1;

				} while (animalSelect < 0 || animalSelect >= catList.size() );

				// Displaying detailed view of selected cat
				System.out.printf("%n" + catList.get(animalSelect).toString() );
				break;

			case 2: // Displays dogs and user selects one to view details of

				System.out.println("Here are some dogs");
				System.out.println();

				// Displaying dogs by name to start with
				for (int i = 0; i < dogList.size(); i++) {
					System.out.println( (i + 1) + ". " + dogList.get(i).getDogName() );
				}

				do { // Selecting a particular dog

					System.out.printf("%nEnter a number to see more details: ");
					animalSelect = scnr.nextInt() - 1;

				} while (animalSelect < 0 || animalSelect >= dogList.size() );

				// Displaying detailed view of selected dog
				System.out.printf("%n" + dogList.get(animalSelect).toString() );
				break;

			case 3: // Displays rabbits and user selects one to view details of

				System.out.println("Here are some rabbits");
				System.out.println();

				// Displaying rabbits by name to start with
				for (int i = 0; i < rabbitList.size(); i++) {
					System.out.println( (i + 1) + ". " + rabbitList.get(i).getRabbitName() );
				}

				do { // Selecting a particular rabbit

					System.out.printf("%nEnter a number to see more details: ");
					animalSelect = scnr.nextInt() - 1;

				} while (animalSelect < 0 || animalSelect >= rabbitList.size() );

				// Displaying detailed view of selected rabbit
				System.out.printf("%n" + rabbitList.get(animalSelect).toString() );
				break;

			case 4: // Example cat comparisons

				System.out.println();

				System.out.println("Comparing: " + catList.get(0).getCatName() 
						+ " with " + catList.get(1).getCatName() );
				System.out.println("Result: " + catList.get(0).compareTo(catList.get(1) ) );

				System.out.println();

				System.out.println("Comparing: " + catList.get(2).getCatName() 
						+ " with " + catList.get(3).getCatName() );
				System.out.println("Result: " + catList.get(2).compareTo(catList.get(3) ) );

				System.out.println();

				break;

			case 5: // Example dog comparisons

				System.out.println();

				System.out.println("Comparing: " + dogList.get(0).getDogName() 
						+ " with " + dogList.get(1).getDogName() );
				System.out.println("Result: " + dogList.get(0).compareTo(dogList.get(1) ) );

				System.out.println();

				System.out.println("Comparing: " + dogList.get(2).getDogName() 
						+ " with " + dogList.get(3).getDogName() );
				System.out.println("Result: " + dogList.get(2).compareTo(dogList.get(3) ) );

				System.out.println();

				break;

			case 6: // Example rabbit comparisons

				System.out.println();

				System.out.println("Comparing: " + rabbitList.get(0).getRabbitName() 
						+ " with " + rabbitList.get(1).getRabbitName() );
				System.out.println("Result: " + rabbitList.get(0).compareTo(rabbitList.get(1) ) );

				System.out.println();

				System.out.println("Comparing: " + rabbitList.get(2).getRabbitName() 
						+ " with " + rabbitList.get(3).getRabbitName() );
				System.out.println("Result: " + rabbitList.get(2).compareTo(rabbitList.get(3) ) );

				System.out.println();

				break;

			default:
				System.out.println("Invalid option");
				break;
			}

		} while (optionKey != 0);

		System.out.println("Thanks for visiting");
		scnr.close();
		
	}

}
