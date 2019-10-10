package cse360assign2;
/**Assignment 2
 * File contains an Adding machine class, which will add, subtract,
 * clear and get the total.
 *
 * @author Alexis Ponce, ID: 1212768568
 *
 * 
 * 
 * 
 *
 */
public class AddingMachine {
/**
 * will ad and subtract a number from the running total of the current state.
 * will start with a number and either add or subtract from it and keep going
 * until clear. will be able to get the total and print all calculations when needed.
 * 
 */
	private int total;
	/**
	 * only needed to start the running total at zero. 
	 * does not return anything other than clarifying the start number.
	 */
	public AddingMachine () {
		total =0;  // not needed - included  for clarity
	}
	/**
	 * gives the user the total number or the number that the current
	 * calculations are at.
	 * @return 0, which is the current total
	 */
	public int getTotal () {
		return 0;
	}
	/**
	 * adds the the inputted number to the current total of
	 * the number.
	 * @param value, input  to add to the number
	 */
	public void add (int value) {
		
	}
	/**
	 * subtracts from tne total or the current sate of the number.
	 * @param value, integer value to subtractt 
	 */
	public void subtract (int value) {
		
	}
	/**
	 * used to print out the history of the calculations
	 */
	public String toString () {
		return "";
	}
	/**
	 * clears the history
	 */
	public void clear() {
		
	}

}
