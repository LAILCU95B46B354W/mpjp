package s076;

public class Pet {
	private static final String DEFAULT_COLOR = "white";
	private static final String DEFAULT_NAME = "My pet";

	private String name;
	private String color;

	public Pet() {
		this(DEFAULT_NAME);
	}

	public Pet(String name) {
		this(name, DEFAULT_COLOR);

	}

	public String getColor() { // Modo che permette all'utente che usa quella classe abbia accesso ad una
								// determinata proprietà
		return color;
	}

	public void setColor(String color) { // Modo che permette all'utente di modificare quella determinata proprietà
		this.color = color;
	}

	public Pet(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

}