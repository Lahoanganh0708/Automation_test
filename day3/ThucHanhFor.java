package day3;

import java.util.Scanner;

public class ThucHanhFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inVaCongSoChan();

//		inMangChuaSoChiaHetCho5(nhapMang());
		sapXepMangTangDan(nhapMang());

	}

	public static void inVaCongSoChan() {
		int sum = 0;
		for (int i = 0; i <= 100; i = i + 2) {
			System.out.print(i + ", ");
			sum += i;
		}
		System.out.println("\n Tổng các số chẵn là " + sum);
	}

	public static int[] nhapMang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập độ dài mảng");
		int n = sc.nextInt();
		System.out.println("nhập các giá trị của mảng");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhập giá trị ở vị trí " + (i + 1));
			a[i] = sc.nextInt();

		}
		return a;

	}

	public static void sapXepMangTangDan(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				int tmp;
				if (a[j] > a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		System.out.println("mảng các số tăng dần là");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j] + " ");
		}
	}

	public static void inMangChuaSoChiaHetCho5(int[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 5 == 0) {
				output[i] = String.valueOf(input[i]);
			} else
				output[i] = null;
		}
		System.out.println("mảng các số chia hết cho 5");
		for (int j = 0; j < output.length; j++) {
			System.out.println(output[j] + " ");
		}
	}
}
