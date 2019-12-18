package s070;

public class Dog implements BarkAndWag {
	@Override
	public String bark() {
		return "woof!";
	}

	public String bark(int count) { // il chiamante mi passa un valore per esempio 3 e
									// gli ritornerà "woof" "woof"
									// "woof"
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < count; i++) {
			sb.append(bark());
		}

		return sb.toString();
	}

	@Override
	public int tailWaggingSpeed() {
		return BarkAndWag.AVG_WAGGING_SPEED;
	}
}