
public class ArrayDemo2 {

	public static void main(String[] args) {
		// �bung #11

		String[] monate = { "J�nner", "Februar", "M�rz", "April", "Mai", "Juni", "Juli", "August", "September",
				"Oktober", "November", "Dezember" };

		for (int t = 0; t < monate.length; t++) {
			System.out.println(monate[t] + "[" + (t + 1) + "]");
		}

	}

}