package co.edu;

public class Singleton {
	static Singleton singleton=new Singleton();
	private Singleton() {
		
	}
	//public getInstance();생성자를 만들 수 있음.
	public static Singleton getInstance() {
		return singleton;
	}
}
