package s044;

public class Main {
	public static void main(String[] args) {
		System.out.println(args.length);
		for (String item : args) {
			System.out.println(item);
		}

		for (int i = 0; i < args.length; i++) { // clausole del loop for
			System.out.println(args[i]); // stampa l'elemento in posizione iesima (corrente) dell'array
		}

// se c'è un elemento che vale 1 , 7 e alla fine stampare se ci sono o non ci sono 
		// se si in che posizione (ultima cosa)
		// se no stampa -1

	}
}