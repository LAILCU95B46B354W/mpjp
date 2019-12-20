package s075;

public class Main {
	public static void main(String[] args) {
		Poodle poodle = new Poodle("Jim");
		Poodle p2 = new Poodle();

		System.out.println(poodle);
		System.out.println(p2);

		Poodle poodle1 = new Poodle("Alyssa", 7, 12);
		Poodle p3 = new Poodle();

		System.out.println(poodle1);
		System.out.println(p3);
	}
}
