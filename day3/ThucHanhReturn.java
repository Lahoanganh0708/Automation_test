package day3;

import java.util.Scanner;

public class ThucHanhReturn {

	public static void main(String[] args) {
System.out.println(level());
	}

	public static String level() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số tháng");
		int soThang = sc.nextInt();
		if (0 < soThang && soThang < 6) {
			return "fresher";
		}else if(soThang >= 6 && soThang<=24)
			return "junior";
		else
			return "senior";
	}
}
