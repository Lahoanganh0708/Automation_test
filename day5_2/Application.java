package day5_2;

public class Application {
	public static void main(String[] args) {
		GiaoVien gv = new GiaoVien();
		gv.setDiaChi("Hà Nội");
		gv.setSoCCCD(123456789);
		gv.setTen("Lã Hoàng Anh");
		gv.setTuoi(25);
		gv.chuyenMon = "Thạc sĩ Toán";
		gv.maGV = "GV01";
		gv.printInfo();
		gv.diChoi();
		gv.diDay();
System.out.println("=================================================");
		SinhVien sv = new SinhVien();
		sv.setDiaChi("Thái Nguyên");
		sv.setSoCCCD(987654321);
		sv.setTen("Nguyễn Văn A");
		sv.setTuoi(19);
		sv.GPA = 4.8;
		sv.maSV ="SV01";
		sv.soTinChi = 130;
		sv.printInfo();
		sv.diChoi();
		sv.diThi();
	}
}
