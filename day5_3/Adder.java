package day5_3;

public class Adder {
public static int Add(int a,int b) {
	return a+b;
}
public static double Add(double a,double b) {
	return a+b;
}
public static void main(String[] args) {
	System.out.println(Add(5,5));
	System.out.println(Add(5.5,5.2));
}
}
