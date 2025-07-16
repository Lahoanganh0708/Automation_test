package day5_5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("QUẢN LÝ NHÂN VIÊN THEO PHÒNG BAN");
        System.out.println("1. Developer");
        System.out.println("2. Tester");
        System.out.println("3. BA");
        System.out.print("Nhập lựa chọn: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhập số lượng Developer: ");
                int soDev = sc.nextInt();
                Developer[] devList = new Developer[soDev];

                for (int i = 0; i < soDev; i++) {
                    System.out.println("\nDeveloper thứ " + (i + 1));
                    devList[i] = new Developer();
                    devList[i].nhapThongTin(sc);
                }

                System.out.println("\nDANH SÁCH DEVELOPER");
                for (int i = 0; i < soDev; i++) {
                    devList[i].inThongTin();
                }
                break;

            case 2:
                System.out.print("Nhập số lượng Tester: ");
                int soTest = sc.nextInt();
                Tester[] testList = new Tester[soTest];

                for (int i = 0; i < soTest; i++) {
                    System.out.println("\nTester thứ " + (i + 1));
                    testList[i] = new Tester();
                    testList[i].nhapThongTin(sc);
                }

                System.out.println("\nDANH SÁCH TESTER");
                for (int i = 0; i < soTest; i++) {
                    testList[i].inThongTin();
                }
                break;

            case 3:
                System.out.print("Nhập số lượng BA: ");
                int soBA = sc.nextInt();
                BA[] baList = new BA[soBA];

                for (int i = 0; i < soBA; i++) {
                    System.out.println("\nBA thứ " + (i + 1));
                    baList[i] = new BA();
                    baList[i].nhapThongTin(sc);
                }

                System.out.println("\nDANH SÁCH BA");
                for (int i = 0; i < soBA; i++) {
                    baList[i].inThongTin();
                }
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }

        sc.close();
    }
}
