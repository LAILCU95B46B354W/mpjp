package s049;

public class MyString {
	static int compareTo(String s, String t) { // il confronto lo faccio nel metodo s e t
		int lengthS = s.length();
		int lengthT = t.length();
		int minLength = 0;

		if (lengthS < lengthT) {
			minLength = lengthS;
		} else {
			minLength = lengthT;
		}

		for (int i = 0; i < minLength; i++) {
			if (s.charAt(i) < t.charAt(i)) {
				return -1;
			} else if (s.charAt(i) > t.charAt(i)) {
				return +1;
			}
		}
		if (lengthS == lengthT) {
			return 0;
		} else if (lengthS < lengthT) {
			return -1;
		} else {
			return +1;
		}

	}

	public static void main(String[] args) {
		String s1 = "Hello";
		String t1 = "World";

		int result1 = compareTo(s1, t1);

		System.out.println("hello vs world, result is:" + result1);

		String s2 = "Hello";
		String t2 = "Hello";

		int result2 = compareTo(s2, t2);

		System.out.println("hello vs world, result is:" + result2);

		String s3 = "Hello";
		String t3 = "hell";

		int result3 = compareTo(s3, t3);

		System.out.println("hello vs world, result is:" + result3);
	}
}
