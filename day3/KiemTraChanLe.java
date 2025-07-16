package day3;

import java.util.Scanner;

public class KiemTraChanLe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số cần kiểm tra");
		int number = sc.nextInt();
		kiemTra(number);
		inNgay(number);
		int[] mangSoNguyen = { 1, 5, 4, 3, 289, 100 };
	}

	public static void kiemTra(int number) {
		String result;
		result = (number % 2 == 0) ? "Số chẵn" : "Số lẻ";
		System.out.println(result);
	}

	public static void inNgay(int number) {
		String result;
		switch (number) {
		case 2:
			result = "Monday";
			break;
		case 3:
			result = "Tuesday";
			break;
		case 4:
			result = "Wednesday";
			break;
		case 5:
			result = "Thurday";
			break;
		case 6:
			result = "Friday";
			break;
		case 7:
			result = "Saturday";
			break;
		case 8:
			result = "Sunday";
			break;
		default:
			result = "Number must be greater than 2 and smaller than 8";
			break;
		}
		System.out.println(result);
	}
}
