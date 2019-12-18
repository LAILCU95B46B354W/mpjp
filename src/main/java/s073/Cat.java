package s073;

public class Cat extends Mammal { // la classe cat estende Mammal, è una classe concreta in cui possiamo creare
									// l'oggetto
	private Tail tail; // vedi classe Tail

	public Cat(int gestationDays, int tailLen) { // costruttore che ha due parametri. Per costruire il gatto devo
													// chiamare il costruttore mammal e per fare questo devo chiamare il
													// costruttore oggetto
		super(gestationDays); // superclasse che rappresenta la chiamata a un costruttore.
		this.tail = new Tail(tailLen); // costruzione della coda con la lunghezza che ha passato l'utente
	}

	@Override
	public String toString() { // metodo definito in object che serve per creare una stringa
		return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
	}
}
