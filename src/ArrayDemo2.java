
public class ArrayDemo2 {

	public static void main(String[] args) {
		// Übung #11

		String[] monate = { "Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September",
				"Oktober", "November", "Dezember" };

		for (int t = 0; t < monate.length; t++) {
			System.out.println(monate[t] + "[" + (t + 1) + "]");
		}

	}

}