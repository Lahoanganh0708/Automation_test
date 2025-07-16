package day5_2;

public class SinhVien extends Nguoi {
	// Thuộc tính riêng của sinh viên
	String maSV;
	double GPA;
	int soTinChi;

//Phương thức riêng của sinh viên
	public void diThi() {
		System.out.println("Sinh viên đi thi cuối kì và giữa kì");
	}

	public void printInfo() {
		System.out.println(super.getTen() + ", " + maSV + ", " + GPA + ", " + super.getDiaChi() + ", " + super.getTuoi()
				+ " tuổi, " + soTinChi);
	}

	@Override
	public void diChoi() {
		System.out.println("Sinh viên thích thì đi chơi");
	}
}
