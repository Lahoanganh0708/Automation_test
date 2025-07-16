package day5_3;

public class Application {

	public static void main(String[] args) {
		HinhTron ht = new HinhTron();
		ht.setTenHinh("Hình tròn");
		ht.banKinh = 5.5;
		System.out.println(ht.getTenHinh()+ " có diện tích là: " +ht.tinhDienTich());
		HinhVuong hv = new HinhVuong();
		hv.setTenHinh("Hình vuông");
		hv.chieuDaiCanh = 5.5;
		System.out.println(hv.getTenHinh()+ " có diện tích là: " +hv.tinhDienTich());
		

	}

}
