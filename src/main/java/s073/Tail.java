package s073;

public class Tail { // classe pubblica
	private int size; // la proprietà tail è inizializzata dal costruttore poco dopo
						// size non può essere modificato in nessun modo perchè è privato

	public Tail(int size) {
		this.size = size; // this serve per chiamare l'OGGETTO CORREBTE e inoltre serve per non creare una
							// identità, senza il this dovremmo scrivere
							// size = size e non avrebbe senso
	}

	public int getSize() {
		return size; //
	}

	@Override
	public String toString() {
		return "Tail [size=" + size + "]";
	}
}
