package part2;

public class Fraction {
	int numerator;
	int denominator;
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	public Fraction(int n) {
		numerator = n;
		denominator = 1;
	}
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	public double toDecimal() {
		return (double)numerator / denominator;
	}
	public String toString() {
		return Integer.toString(numerator) + "/" + Integer.toString(denominator);
	}
	public Fraction simplify() {
		int gcf = 0;
		for(int i = 1; i <= numerator; i++) {
			if(numerator % i == 0 && denominator % i == 0) {
				gcf = i;
			}
		}
		return new Fraction(numerator / gcf, denominator / gcf);
	}
	public boolean equals(Fraction f) {
		f = f.simplify();
		Fraction temp = new Fraction(numerator, denominator);
		temp = temp.simplify();
		return f.numerator == temp.numerator && f.denominator == temp.denominator;
	}
}
