
public class ArrayDemo {

	public static void main(String[] args) {

		// Übung #9

		/*
		 * int[] array1 = new int[3]; // hier muss die Längenangabe drinn sein -
		 * // nicht vorne int[] array2 = new int[3];
		 * 
		 * array1[0] = 3; array1[1] = 4; array1[2] = 5;
		 * 
		 * array2[0] = 7; array2[1] = 1; array2[2] = 3;
		 * 
		 * 
		 * System.out.println((array1[0]+array2[0]) + ","
		 * +(array1[1]+array2[1])+ "," +(array1[2]+array2[2]));
		 * 
		 * System.out.println((array1[0]*array2[0]) + ","
		 * +(array1[1]*array2[1])+ "," +(array1[2]*array2[2]));
		 * 
		 */

		String[] tage = { "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So" };

		for (int t = 0; t < tage.length; t++) {
			System.out.println(tage[t]);
		}

	}

}
