package day4;

public class Developer {

	public static void main(String[] args) {
		Employee hoang_anh = new Employee();
		hoang_anh.setEmployee_id(1);
		hoang_anh.setEmployee_name("Lã Hoàng Anh");
		
		System.out.println("Developer ID: " + hoang_anh.getEmployee_id()+" Developer Name: " + hoang_anh.getEmployee_name()+" Developer Salary: $" + hoang_anh.getEmployee_salary());

		Employee hoang = new Employee();
		hoang.setEmployee_id(2);
		hoang.setEmployee_name("Lã Nhật Hoàng");
		
		System.out.println("Developer ID: " + hoang.getEmployee_id()+" Developer Name: " + hoang.getEmployee_name()+" Developer Salary: $" + hoang.getEmployee_salary());
	}
	//NHẬN XÉT VỀ SALARY
	//Chỉ có getter mà không có setter giúp bảo mật các dữ liệu nhạy cảm, tránh việc sửa đổi sai hoặc gian lận từ người dùng.
	//khi không set giá trị cố định cho lương sẽ in ra 0.

}
