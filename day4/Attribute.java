package day4;

public class Attribute {
	// Biến thuộc class gọi là thuộc tính (attribute) x
	int x = 40;

	public static void main(String[] args) {
		Attribute att = new Attribute();
		att.x = 50;
		System.out.println("giá trị cuối cùng của x là " + att.x);
	}

}
