package cse360assign2;

/**
 * This class implements a machine that counts 
 * addition and subtraction operations.
 * @author Benjamin Robbins
 *
 */

public class AddingMachine {
	
	private int total;
	/**
	 * This constructs an adding machine that 
	 * will keep track of addition and subtraction
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This returns the total of all operations.
	 * @return An integer that represents the total amount of the values added
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * This adds a value to the total.
	 * @param value the value to be added
	 */
	public void add (int value) {
		total += value;
	}
	/**
	 * This subtracts a value from the total.
	 * @param value the value to be subtracted
	 */
	public void subtract (int value) {
		
	}
	/**
	 * This will return a string that represents the value of getTotal().
	 * @return A string that represents the total
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * Resets the total to 0.
	 */
	public void clear() {
		
	}
	// made a comment at the bottom of the program
}