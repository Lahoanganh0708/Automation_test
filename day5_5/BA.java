package day5_5;

import java.util.Scanner;

public class BA extends Employee {
    private int soDuAnQuanLy;

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Số dự án đang quản lý: ");
        soDuAnQuanLy = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Số dự án đang quản lý: " + soDuAnQuanLy);
    }
}
