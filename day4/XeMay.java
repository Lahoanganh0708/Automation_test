package day4;

public class XeMay {

	public static void main(String[] args) {
		Xe sh = new Xe();
		sh.setTenXe("SH");
		sh.setLoaiXe("Xe máy");
		sh.setVanTocMax("180km/h");
		System.out.println("Tên xe:" +sh.getTenXe()+", Loại xe:"+sh.getLoaiXe()+", Vận tốc tối đa: "+sh.getVanTocMax());
		
		Xe XeTaxi = new Xe();
		XeTaxi.setTenXe("Honda");
		XeTaxi.setLoaiXe("Xe ô tô");
		XeTaxi.setVanTocMax("300km/h");
		System.out.println("Tên xe:" +XeTaxi.getTenXe()+", Loại xe:"+XeTaxi.getLoaiXe()+", Vận tốc tối đa: "+XeTaxi.getVanTocMax());
		
	}

}
