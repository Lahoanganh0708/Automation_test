package day5_4;

public class Application {

	public static void main(String[] args) {
		TinhLuong luong = new TinhLuong();
        System.out.println(String.format("%.12f", luong.tinhLuong(1000000, 2, 3, 1)));
        System.out.println(String.format("%.12f", luong.tinhLuong(1000000, 2, 5)));
        System.out.println(String.format("%.12f", luong.tinhLuong(1000000, 2)));
	}

}
