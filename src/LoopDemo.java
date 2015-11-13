
public class LoopDemo {

	public static void main(String[] args) {
		/*
		 * idealtypisches Beisiel für Anfänger for (int i = 1; i <= 10; i++) {
		 * 
		 * System.out.println("Durchlauf: " + i); }
		 * 
		 * 
		 * int j = 1; das wäre die zweite Möglichkeit mit while while (j <= 10)
		 * { System.out.println("Durchlauf: " + j); j++; }
		 */

		/*
		 * for(int j = 1;j<=10;) { hier noch eine weitere Möglichkeit
		 * System.out.println("Durchlauf: " + j); j++; }
		 */

		/*
		 * Verständnisfragen zur for Schleife: ad 2) von 10 absteigend bis 0
		 * for(int i=10;i>=0;i--)
		 * 
		 * ad 3) 20 bis 90 nur jede 5te Zahl ausgeben for(int i=20;i<=90;i+=5)
		 * 
		 * alle Zahlen zwischen 1 und 100 nur jene, die durch 3 teilbar sind
		 * ausgeben
		 * 
		 * 
		 * for(int i=1;i<=100;i++) { if (i%3==0){
		 * 
		 * System.out.println("Durchlauf: " + i);
		 * 
		 * }
		 */

		/*
		 * Abbruch wenn 10te Zahl gefunden wurde, die durch 3 teilbar ist
		 * (zwischen 1...100)
		 * 
		 * int z = 0;
		 * 
		 * for (int i = 1; i <= 100; i++) { if (i % 3 == 0) { z++;
		 * System.out.println("Durchlauf: " + i);
		 * 
		 * }
		 * 
		 * if (z==10) { break; }
		 * 
		 * }
		 */

		// Ausagbe aller Zahlen 1...100
		// jene Zahlen die durch 5 teilbar bzw. die Zahlen
		// 40...70 generell ausschließen von der Ausgabe

		for (int i = 1; i <= 100; i++) {
			// prüfen ob wir überhaupt ausgeben
			// und sonst mit continue weitermachen

			if ((i >= 40 && i <= 70) || (i % 5 == 0)) {
				continue;
			}

			System.out.println("Durchlauf: " + i);

		}

	}

}
