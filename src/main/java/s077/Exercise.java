package s077;

public class Exercise {
	public static void main(String[] args) {
		// array di pet con un cane e un gatto

		// foreach sui pet e fare abbaiare i cani e miagolare i gatti

		Pet[] pets = { new Dog("Alyssa"), new Cat("Molly") };

		for (Pet item : pets) {
			if (item instanceof Dog) {

//   ((Dog) pet).bark();     il mio pet lo casto a dog e lo faccio abbaiare 
				Dog current = (Dog) item;
				current.bark();
			} else if (item instanceof Cat) {

//     ((Cat) pet).meow(); il mio pet lo casto a cat e lo faccio miagolare
				Cat current = (Cat) item;
				current.meow();
			} else {
				System.out.println("Unknow pet");
			}
		}
	}
}
