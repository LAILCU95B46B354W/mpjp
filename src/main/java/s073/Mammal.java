package s073;

public abstract class Mammal { // essendo astratta non potrò creare un oggetto mammifero
	protected int gestation; // PROPRIETA' protetta 

	public Mammal(int gestation) { // COSTRUTTORE che ha lo stesso nome della classe

		this.gestation = gestation; // This è come se fosse un reference all'oggetto corrente. Il valore che mi
									// passa l'utente lo voglio mettere nella proprietà gestation. gestation è
									// uguale alla variabile gestation che ci ha passato l'utente.
	}

	@Override
	public String toString() {
		return "Mammal [gestation=" + gestation + "]";
	}
}
