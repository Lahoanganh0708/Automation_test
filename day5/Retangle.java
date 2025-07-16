package day5;

public class Retangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Draw rectangle by 4 line with " + super.getColor());
	}
}
