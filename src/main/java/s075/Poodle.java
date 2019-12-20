package s075;

public class Poodle extends Dog { // il poodle estende la classe dog
	private static final int DEFAULT_DENSITY = 3; // costante final, rimarcato dal "default"
	private int curlDensity; // proprietà

	public Poodle() {
		super(); // chiamo il costruttore di default del dog. Se non dovessimo metterlo il
					// compilatore lo fa al posto nostro e inserisce lui il costruttore di default
		this.curlDensity = DEFAULT_DENSITY; // l'utente non ha passato il valore di curlDensity e quindi inseriamo il
											// default_density
	}

	public Poodle(String name) {
		super(name);
	}

	public Poodle(String name, int weight) {
		this(name, weight, DEFAULT_DENSITY);
	}

	public Poodle(String name, int weight, int curlDensity) {
		super(name, weight); // super lo si mette sempre per primo rispetto al this per fare tutto in modo
								// più ordinato dall'interno verso l'esterno
		this.curlDensity = curlDensity;
	}

	@Override
	public String getName() {
		return "Poodle " + super.getName();
	}

	@Override
	public String toString() {
		return "Poodle " + super.toString() + " " + curlDensity;
	}
}
