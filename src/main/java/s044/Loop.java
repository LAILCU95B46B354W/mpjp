package s044;

public class Loop {
	public static void main(String[] args) {
		int[] data = { 5, 7, 1, 3, 4 }; // data è il nostro array con i valori all'interno
		System.out.print("[");
		for (int i = 0; i < data.length; i++) { // condizioni NECESSARIE del for

			System.out.print(data[i]);
			if (i != data.length - 1) { // i < data.length -1
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println();

		int i = 0;
		System.out.print("[");
		while (i < data.length) { // WHILE
			System.out.print(data[i]);
			if (i != data.length - 1) {
				System.out.print(",");
			}

			i += 1; // ++i ; i++ ; i = i+ 1 ; i+ = 1

		}
		System.out.print("]");
		System.out.println(); // Lo usiamo per far andare a capo senza scriverci nulla

		System.out.print("[");
		for (int item : data) { // FOREACH
			System.out.print(item);
			System.out.print(",");
		}
		System.out.print("]");
		
		
		
	}
}
