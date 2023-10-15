/**
 * 
 */
package first;

import java.math.BigDecimal;

/**
 * 
 */
/**
 * 
 */
public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method
		BigDecimal bigD = new BigDecimal(56);

		System.out.println("string to print");
		System.out.println();

		int j = 19;

		for (int j2 = 0; j2 < args.length; j2++) {
			System.out.println(args[j2]);
		}
		StudentPOJO studentPOJO = new StudentPOJO(1, 2, 3, 4);

		studentPOJO.setA(10);
		studentPOJO.setB(20);
		studentPOJO.setC(60);
		studentPOJO.setD(70);

		System.out.println(studentPOJO.toString());
		System.out.println(bigD);

		try {
			System.out.println("what to do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param bigDecimal
	 * @author Pranjal Sisodia @
	 */
	private static void extractedMethodFromMain(BigDecimal bigDecimal) {
		System.out.println(bigDecimal);
	}

	/**
	 * 
	 */
	public class ThirdClass {

	}

}
