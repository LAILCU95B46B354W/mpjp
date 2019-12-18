package s073;

public class Main {
	public static void main(String[] args) {
		Mammal[] mammals = new Mammal[2]; // array di mammal (che erano astratti)
		mammals[0] = new Dog(63, 40);
		mammals[1] = new Cat(63, 20);

		for (Mammal mammal : mammals) { // per ogni mammals di mammal
			System.out.println(mammal.toString());
		}
	}
}
