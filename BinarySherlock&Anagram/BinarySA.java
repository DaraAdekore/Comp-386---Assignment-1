import java.util.*;
/**
 * 
 */

/**
 * @author Dara Adekore
 *
 */
public class BinarySA {
	
	/**
	 * this function takes in a string value and returns the sherlockAnagram
	 * value for the string.
	 * @param a string to be parsed.
	 * @return the sherlockAnagram value of the string
	 */
	public int sherlockValue(String a) {
		int anagramValue = 0;
		Map<String, Integer> hashTable = new HashMap<String, Integer>();
		//- - - - - -
		for(int i  = 0; i < a.length(); i++){
			for(int j = i; j<a.length(); j++) {
				char[] characters = a.substring(i, j+1).toCharArray();
				Arrays.sort(characters);
				String checkString = new String(characters);
				
				if (hashTable.containsKey(checkString)) {
					anagramValue += hashTable.get(checkString);
					hashTable.put(checkString, hashTable.get(checkString) + 1);
				}else {
					hashTable.put(checkString, 1);
				}
			}
		}
		System.out.println("Anagram value for: " + a + " = " + anagramValue);
		return anagramValue;
	}
	
	/**
	 * this function decides if the to values passed are anagram divisible
	 * assuming the values passed in are anagram values.
	 * @param a
	 * @param b
	 * @return true if the two numbers are anagram divisible.
	 */
	public boolean isAnagramDivisible(int a, int b) {
		
		if (isEven(a%b)) {
			return true;
		}
		else if (isEven(b%a)) {
			return true;
		}
		return false;
	}
	
	/**
	 * returns true if the value is 0
	 * false if there is a remainder.
	 * @param value
	 * @return true or false.
	 */
	public boolean isEven(int value) {
		return value % 2 == 0 ? true : false;
	}
	
	/**
	 * Converts an integer into a string represented binary value
	 * @param number integer value to be parsed.
	 * @return a string with the binary value of the integer.
	 */
	public String toBinary(int number) {
		int bits;
		// An array to hold the binary conversion of our number
		
		//Change of base to get the number of bits required to represent our number
		if(number % 2 == 0) {
			bits = (int) ((Math.log(number)) / Math.log(2)) + 1;
		}else {
			bits =  (int) Math.ceil((Math.log(number)) / Math.log(2));
		}
		
		//Character array so we don't have to write a another loop to reverse the string
		char[] toString = new char[bits];
		
		// A pointer for our index in the array
		while((bits - 1) >= 0) {
			// Retain the remainder of the the calculation in the array
			toString[bits-1] = (char)(number%2 + '0');
			number /= 2;
			bits--;
		}
		return String.valueOf(toString);
	}
}
