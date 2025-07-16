package day4;

public class Motobike {
String hang;
String mau;
String bien_so;
String ngay_dang_ki;
public String getInfo() {
	return"Hãng là:"+hang+", màu là :"+mau+", biển số là: "+bien_so+", ngày đăng kí là: "+ngay_dang_ki;
}
	public static void main(String[] args) {
		Motobike vision = new Motobike();
		vision.hang ="Vision";
		vision.mau ="đen";
		vision.bien_so ="29A-456.78";
		vision.ngay_dang_ki="7/7/2025";
		System.out.println(vision.getInfo());
		Motobike sh = new Motobike();
		sh.hang ="SH";
		sh.mau ="xám";
		sh.bien_so ="51G-123.45";
		sh.ngay_dang_ki="30/3/2022";
		System.out.println(sh.getInfo());
		Motobike lead = new Motobike();
		lead.hang ="lead";
		lead.mau ="trắng";
		lead.bien_so ="43C-987.65";
		lead.ngay_dang_ki="7/8/2017";
		System.out.println(lead.getInfo());

	}

}
