package day5;

public class Circle extends Shape {
	@Override
	public void draw(){
		System.out.println("Draw circle by 1 line with "+super.getColor());
	}
}
