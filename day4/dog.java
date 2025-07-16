package day4;

public class dog {
//Thuộc tính 
	String breed ;
	String size;
	double age;
	String color;
	//Phương thức trả về thông tin 
	public String getInfo() {
		return"Breed is:"+breed+", size is :"+size+", age is: "+age+", color is: "+color;
	}
	public static void main(String[] args) {
		// Khởi tạo các đối tượng Dog
		dog beggie = new dog();
		beggie.breed = "Beggie";
		beggie.size = "Big";
		beggie.age = 1.5;
		beggie.color = "Brown";
		System.out.println(beggie.getInfo());
		
		dog puddle = new dog();
		puddle.breed = "Puddle";
		puddle.size = "Small";
		puddle.age = 3;
		puddle.color = "Orange";
		System.out.println(puddle.getInfo());
	}

}
