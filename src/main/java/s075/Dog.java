package s075;

public class Dog {
	private static final String DEFAULT_NAME = "???"; // finale rappresenta una costante
	private static final int DEFAULT_WEIGHT = 7;

	private String name; // proprietà del cane
	private int weight; // proprietà del cane

	public Dog() {
		this(DEFAULT_NAME, DEFAULT_WEIGHT);
	}

	public Dog(String name) {
		this(name, DEFAULT_WEIGHT);
	}

	public Dog(int weight) {
		this(DEFAULT_NAME, weight);
	}

	public Dog(String name, int weight) { // la proprietà name viene inizializzata con il parametro name
		this.name = name; // passo i parametri
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "S71Dog [name=" + name + ", weight=" + weight + "]";
	}
}
