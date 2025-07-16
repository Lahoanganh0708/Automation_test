package day5_2;

public class GiaoVien extends Nguoi {
	// Thuộc tính riêng của giáo viên
	String maGV;
	String chuyenMon;

//Phương thức riêng của giáo viên 
	public void diDay() {
		System.out.println("giáo viên đi dạy 5 ngày 1 tuần");
	}

	public void printInfo() {
		System.out.println(
				super.getTen() + ", " + maGV + ", " + chuyenMon + ", " + super.getDiaChi() + ", " + super.getTuoi()+" tuổi");
	}

	@Override
	public void diChoi() {
		System.out.println("Giáo viên đi chơi vào ngày nghỉ");
	}
}
