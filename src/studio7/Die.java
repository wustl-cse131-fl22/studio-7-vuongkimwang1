package studio7;

public class Die {
	private int sides;

	public Die(int n) {
		sides = n;
	}

	public int getNumber() {
		return (int) (Math.random() * (sides) + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die n = new Die(6);

		for (int i = 0; i < 10; i++) {
			System.out.println(n.getNumber());
		}
	}

}
