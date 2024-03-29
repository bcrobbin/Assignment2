package cse360assign2;
/* Benjamin Robbins
 * CSE 360 85141 Calliss
 * Assignment: 2
 */
/**
 * This class implements a machine that counts 
 * addition and subtraction operations.
 */

public class AddingMachine {
	
	private int total;
	private String totalString = "0";
	
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
		return total;
	}
	
	/**
	 * This adds a value to the total.
	 * @param value the value to be added
	 */
	public void add (int value) {
		total += value;
		totalString += " + " + value;
	}
	
	/**
	 * This subtracts a value from the total.
	 * @param value the value to be subtracted
	 */
	public void subtract (int value) {
		total -= value;
		totalString += " - " + value;
	}
	
	/**
	 * This will return a string that represents the value of getTotal().
	 * @return A string that represents the total
	 */
	public String toString () {
		return totalString;
	}
	
	/**
	 * Resets total to 0 and totalString to "".
	 */
	public void clear() {
		totalString = "0";
		total = 0;
	}
}