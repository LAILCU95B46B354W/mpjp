package ex;

public class Cat {
	static int count = 0;

	static int getCounter() {

		return count;

	}

	Cat() {
		count += 1;
	}
}
