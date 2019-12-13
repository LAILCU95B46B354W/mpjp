package s048;

public class Main {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[10]; // array di reference con dentro un null perchè ancora abbiamo un array vuoto
									// dogs è il nome dell'array

		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
		}
		dogs[5].bark();
	}

}
