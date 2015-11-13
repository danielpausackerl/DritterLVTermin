
public class ArrayDemo3 {

	public static void main(String[] args) {
		// Übung #11

		int array[] = new int[10];
		int ergebnis = 0;

		array[0] = 3;
		array[1] = 5;
		array[2] = 6;
		array[3] = 8;
		array[4] = 1;
		array[5] = 0;
		array[6] = 6;
		array[7] = 4;
		array[8] = 8;
		array[9] = 5;

		for (int i = 0; i < 10; i++) {
			ergebnis += array[i];

		}

		System.out.println(ergebnis);

	}

}