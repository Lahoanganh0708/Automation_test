package day5_5;

import java.util.Scanner;

public class Employee {
    protected String hoTen;
    protected String maNV;
    protected String sdt;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void nhapThongTin(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhập họ tên: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhập mã nhân viên: ");
        setMaNV(sc.nextLine());
        System.out.print("Nhập số điện thoại: ");
        setSdt(sc.nextLine());
    }

    public void inThongTin() {
        System.out.println("Họ tên: " + getHoTen() + " | Mã NV: " + getMaNV() + " | SĐT: " + getSdt());
    }
}
