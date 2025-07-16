package day3;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		System.out.println("Sắp xếp tăng dần");
		int[] mangTang = nhapMang();
		sapXepMangTangDan(mangTang);
		System.out.println("\nSắp xếp giảm dần");
		int[] mangGiam = nhapMang();
		sapXepMangGiamDan(mangGiam);

		System.out.println("\nBài 2: Kiểm tra số chia hết cho 2 và 3");
		bai2_KiemTraChiaHet();

		System.out.println("\nBài 3: Tìm min int và max double");
		bai3_TimMinMax();
	}

	public static int[] nhapMang() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập độ dài mảng: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Nhập các giá trị của mảng:");
		for (int i = 0; i < n; i++) {
			System.out.print("Giá trị ở vị trí " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		return a;
	}

	public static void sapXepMangTangDan(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}

		System.out.println("Mảng sau khi sắp xếp tăng dần:");
		for (int i = 0; i < a.length; i++) {
		    System.out.print(a[i] + " ");
		}

	}

	public static void sapXepMangGiamDan(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}

		System.out.println("Mảng sau khi sắp xếp giảm dần:");
		for (int i = 0; i < a.length; i++) {
		    System.out.print(a[i] + " ");
		}

	}

	public static void bai2_KiemTraChiaHet() {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 20; i++) {
			System.out.print("Nhập số thứ " + i + ": ");
			int number = scanner.nextInt();

			if (number % 2 == 0 && number % 3 == 0) {
				System.out.println("Số thoả mãn");
				return;
			}
		}

		System.out.println("Không tìm thấy số thoả mãn");
	}

	public static void bai3_TimMinMax() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số phần tử mảng số nguyên: ");
		int n = scanner.nextInt();
		int[] intArr = new int[n];

		System.out.println("Nhập " + n + " số nguyên:");
		for (int i = 0; i < n; i++) {
			intArr[i] = scanner.nextInt();
		}

		int min = intArr[0];
		for (int i = 1; i < n; i++) {
			if (intArr[i] < min) {
				min = intArr[i];
			}
		}
		System.out.println("Giá trị nhỏ nhất trong mảng: " + min);

		System.out.print("Nhập số phần tử mảng số thực: ");
		int m = scanner.nextInt();
		double[] doubleArr = new double[m];

		System.out.println("Nhập " + m + " số thực:");
		for (int i = 0; i < m; i++) {
			doubleArr[i] = scanner.nextDouble();
		}

		double max = doubleArr[0];
		for (int i = 1; i < m; i++) {
			if (doubleArr[i] > max) {
				max = doubleArr[i];
			}
		}
		System.out.println("Giá trị lớn nhất trong mảng: " + max);
	}

}
