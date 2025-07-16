package day5_2;

public class Nguoi {
	private String ten;
	private int tuoi;
	private long soCCCD;
	private String diaChi;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public long getSoCCCD() {
		return soCCCD;
	}
	public void setSoCCCD(long soCCCD) {
		this.soCCCD = soCCCD;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void diChoi() {
		System.out.println("đi choi khi có tiền");
	}
	
}
