package co.edu.inherit.friend;

public class Cat extends Animal{
	//Animal 클래스 추상 클래스 구현
	@Override
	public void eat() {
		System.out.println("고양이가 먹이를 먹습니다.");
	}
	@Override
	public void speak() {
		System.out.println("야옹야옹.");
	}
}
