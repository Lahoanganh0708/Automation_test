package day5_5;

import java.util.Scanner;

public class BA extends Employee {
    private int soDuAnQuanLy;

    public int getSoDuAnQuanLy() {
        return soDuAnQuanLy;
    }

    public void setSoDuAnQuanLy(int soDuAnQuanLy) {
        this.soDuAnQuanLy = soDuAnQuanLy;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Số dự án đang quản lý: ");
        setSoDuAnQuanLy(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Số dự án đang quản lý: " + getSoDuAnQuanLy());
    }
}
