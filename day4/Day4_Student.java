package day4;

public class Day4_Student {

	public static void main(String[] args) {
		Day4_Person paul = new Day4_Person();
		paul.setAge(18);
		paul.setName("Paul Marker");
		paul.setPhoneNo("0983663618");
		System.out.println("name:" +paul.getName()+" age:"+paul.getAge()+" phone number: "+paul.getPhoneNo());
		
		Day4_Person Hoang_Anh = new Day4_Person();
		Hoang_Anh.setAge(21);
		Hoang_Anh.setName("Hoàng Anh");
		Hoang_Anh.setPhoneNo("0983663618");
		System.out.println("name:" +Hoang_Anh.getName()+" age:"+Hoang_Anh.getAge()+" phone number: "+Hoang_Anh.getPhoneNo());
	}

}
