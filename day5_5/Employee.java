package day5_5;

import java.util.Scanner;

public class Employee {
    protected String hoTen;
    protected String maNV;
    protected String sdt;

    public void nhapThongTin(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        sdt = sc.nextLine();
    }

    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen + " | Mã NV: " + maNV + " | SĐT: " + sdt);
    }
}