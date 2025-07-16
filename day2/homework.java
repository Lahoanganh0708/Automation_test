package day2;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào 1 số từ bàn phím: ");
		int number = scanner.nextInt();
		if(number % 2  == 0) {
        System.out.println(number+ " là số chẵn");
	    }else {
		System.out.println(number+ " là số lẻ");
		System.out.println("nhập số lượng phần tử của mảng: ");
		int n = scanner.nextInt();
		int[]arr = new int[n];
		System.out.println("nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("tổng các phần tử trong mảng là: " + sum);
	}		
  }
}

