
public class TurmRechner {
	public static void main(String[] args) {

		int start = 2;

		for (int counter = 2; counter <= 9; counter++) {
			System.out.println(start + " * " + counter);
			start = start * counter;
		}

		for (int counter = 2; counter <= 9; counter++) {
			System.out.println(start + " / " + counter);
			start = start / counter;
		}
		System.out.println(start);
	}
}
