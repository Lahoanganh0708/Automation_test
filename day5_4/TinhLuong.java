package day5_4;

public class TinhLuong {


    public double tinhLuong(int luongCoban, double heSoLuong, double soNamKN, int loaibs) {
        switch (loaibs) {
            case 1:
                return luongCoban * heSoLuong * soNamKN + luongCoban * 0.2;

            case 2:
                return luongCoban * heSoLuong * soNamKN + luongCoban * 0.45;

            default:
                System.out.println("Loại bác sĩ không hợp lệ");
                return luongCoban; 
        }
    }

    public double tinhLuong(int luongCoBan, double heSoLuong, double soNamKN) {
        return luongCoBan * heSoLuong * soNamKN;
    }

    public double tinhLuong(int luongCoBan, double heSoLuong) {
        return luongCoBan * heSoLuong;
    }
}
