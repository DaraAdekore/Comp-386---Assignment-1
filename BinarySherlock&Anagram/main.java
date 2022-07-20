
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySA isAD = new BinarySA();

		test(isAD, 10, 26);

	}
	
	/**
	 * To test the overall function of te isAnagramDivisible functionality.
	 * @param isAD
	 * @param a
	 * @param b
	 */
	public static void test(BinarySA isAD, int a, int b) {
		System.out.println(
				isAD.isAnagramDivisible(isAD.sherlockValue(isAD.toBinary(a)), isAD.sherlockValue(isAD.toBinary(b)))
						? "The two numbers are anagrammatically divisible"
						: "The two numbers are not anagrammatically divisible");
	}
}
