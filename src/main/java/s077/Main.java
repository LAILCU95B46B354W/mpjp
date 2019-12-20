package s077;

public class Main {
	public static void main(String[] args) {
//		Cat cat = (Cat) new Dog();   questo è commentato perchè non lo possiamo scrivere, 
		// non possiamo creare un nuovo dog nella classe cat

		Pet pet = new Dog("Bob"); // creo un nuovo cane e lo metto come reference a pet che è una superclass

		// risky
		Dog dog = (Dog) pet; // downcasting : trasformo un reference a pet ad un reference a dog
		dog.bark();

		// next line leads to a ClassCastException
//		Cat cat = (Cat) pet;
		// next line is just not to have a warning for unused cat on the previous line
//		System.out.println(System.identityHashCode(cat));

		if (pet instanceof Cat) {
			Cat tom = (Cat) pet;
			tom.meow();
		} else {
			System.out.println("This pet is not a cat!");

			if (pet instanceof Cat) {
				Dog tom = (Dog) pet;
				tom.bark();
			}
		}
	}
}
