package day2;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		System.out.println("Name: Hoàng Anh");
		System.out.println("Email: lahoanganh2004@gmail.com");
		System.out.println("Phone Number: +84983663618");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Nhập số thứ nhất");
//		int st1 = scan.nextInt();
//		System.out.println("Nhập số thứ hai");
//		int st2 = scan.nextInt();
//		printLargerNumber(st1, st2);
		phepTinh();
	}
//	public static void printLargerNumber(int number1, int number2) {p
//		if (number1 > number2) {
//			System.out.println("số lớn hơn là " +number1);
//		} else{
//			System.out.println("số lớn hơn là " +number2);
//		}
//	}
	public static void phepTinh() {
		double result = 0;
		result = (1123*6745)/500;
		System.out.println("kết quả phép tính là: " +result);
	}
}
	