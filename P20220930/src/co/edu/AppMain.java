package co.edu;
//하나의 실행클래스와 여러개의 라이브러리클래스.
public class AppMain {
	public static void main(String[] args) {
		//Object->Class->Instance
		Person kim=new Person();//인스턴스 생성.
		kim.name="김민기";
		kim.age=20;
		kim.sleep();
		kim.eat("사과");
		kim.run();
		System.out.println(kim);
		Person lee=new Person();
		lee.name="이순신";
		lee.age=25;
		lee.sleep();
		lee.eat("바나나");
		
		Student stud1=new Student();
		stud1.setStudNo("123-123");
		stud1.setStudName("홍민기");
		Student stud2=new Student();
		stud2.setStudNo("234-324");
		stud2.setStudName("김민기");
		System.out.println(stud1);
		
		Student stud3=new Student();
		Student[] students;
		students=new Student[] {stud1,stud2,stud3};
		for(Student stud : students) {
			System.out.println("학번:"+stud.getStudNo()+",학생이름:"+stud.getStudName());
		}
		
		//상속
		WorkMan wman=new WorkMan();
		wman.name="직장인";
		wman.age=30;
		StudMan sman=new StudMan();
		sman.school="고등학교";
		sman.height=164.3;
		
	}
}
