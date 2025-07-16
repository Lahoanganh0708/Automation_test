package day5_5;

import java.util.Scanner;

public class Developer extends Employee {
    private String ngonNguLapTrinh;

    public String getNgonNguLapTrinh() {
        return ngonNguLapTrinh;
    }

    public void setNgonNguLapTrinh(String ngonNguLapTrinh) {
        this.ngonNguLapTrinh = ngonNguLapTrinh;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Ngôn ngữ lập trình: ");
        setNgonNguLapTrinh(sc.nextLine());
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Ngôn ngữ lập trình: " + getNgonNguLapTrinh());
    }
}
