package day5_5;

import java.util.Scanner;

public class Tester extends Employee {
    private String loaiTest;

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Loại test: ");
        loaiTest = sc.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Loại test: " + loaiTest);
    }
}
