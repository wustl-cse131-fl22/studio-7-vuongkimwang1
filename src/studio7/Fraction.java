package studio7;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int x, int y) {
		numerator = x;
		denominator = y;
	}

	public static Fraction sum(Fraction a, Fraction b) {
		int an = a.numerator * b.denominator;
		int ad = a.denominator * b.denominator;
		int bn = b.numerator * a.denominator;
		int bd = b.denominator * a.denominator;

		return new Fraction(an + bn, bd);
	}

	public static Fraction multiply(Fraction a, Fraction b) {
		return new Fraction(a.numerator * b.numerator, a.denominator * b.denominator);
	}

	public static Fraction reciprocal(Fraction a) {
		return new Fraction(a.denominator, a.numerator);
	}

	public static Fraction simplify(Fraction a) {
		int counter = 2;

		if (a.numerator % a.denominator != 0 || a.denominator % a.numerator != 0) {
			return a;
		}

		while (true) {
			if (a.numerator % counter == 0 && a.denominator % counter == 0) {
				System.out.println(counter);
				return new Fraction(a.numerator / counter, a.denominator / counter);
			}
			counter++;
		}
	}
	
	public static int simplifyRecursive(int x, int y) {
		if(x == 0) {
			return y;
		}
		else {
			
		}
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public static void main(String[] args) {
		Fraction a = new Fraction(2, 5);
		Fraction b = new Fraction(3, 2);

		Fraction c = sum(a, b);

		System.out.println(c.toString());

		Fraction d = new Fraction(5, 7);

		System.out.println(simplify(d).toString());

		Fraction e = new Fraction(3, 6);

		System.out.println(simplify(e).toString());
	}

}
