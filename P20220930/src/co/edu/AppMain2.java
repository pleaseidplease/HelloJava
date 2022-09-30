package co.edu;

public class AppMain2 {
	public static void main(String[] args) {
		
		Student.staticMethod();
		Math.random();
		Math.round(.5);
		Student s1=new Student();
//		s1.staticMethod();
		s1.setStudNo("111-111");
		s1.setStudName("홍길동");
		s1.setmajor("컴퓨터공학과");
		s1.setAge(20);
		System.out.println(s1.getStudNo());
		System.out.println(s1.getAge());
		System.out.println(s1.showInfo());
		
		System.out.println("여기===>"+s1);
		
		Student s2=new Student();
		s2.setStudName("김민숙");
		s2.setStudNo("111-222");
		s2.setmajor("컴퓨터공학과");
		s2.setAge(22);
		System.out.println(s2.showInfo());
		
		String[] hob= {"독서","자전거"};
		s1.setHobbies(hob);
		s1.addHobby("음악듣기");
		System.out.println(s1.getHobb());
		System.out.println(s2.getHobb());
		
		Student s3=new Student();
		System.out.println(s3.getStudName());
		
		Student s4=new Student("111-234","주소영");
		System.out.println(s4.showInfo());
		
		Student s5=new Student("222-222","송지은","역사학과");
	}
}
