package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * length + 2 * width;
	}

	public static boolean compareArea(Rectangle a, Rectangle b) {
		double aa = a.width * a.length;
		double ab = b.width * b.length;

		return aa > ab;
	}

	public static boolean isSquare(Rectangle a) {
		return a.length == a.width;
	}

	public static void drawRectangle(Rectangle a, double x, double y) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(x, y, a.length / 2, a.width / 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle(0.5, 0.3);
		Rectangle b = new Rectangle(0.2, 0.2);

		System.out.println(a.getArea());
		System.out.println(a.getPerimeter());
		System.out.println(compareArea(a, b));
		System.out.println(isSquare(a));
		drawRectangle(a, 0.5, 0.5);
	}

}
