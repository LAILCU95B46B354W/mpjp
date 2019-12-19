package ex;

public class EvenNumbers {
	public static int[] divisibleBy(int[] numbers, int divider) {
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				count += 1;
			}

		}

		int[] result = new int[count];
		int pos = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				result[pos] = numbers[i];
				pos++;

			}

		}
		return result;
	}
}
