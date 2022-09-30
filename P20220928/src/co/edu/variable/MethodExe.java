package co.edu.variable;

public class MethodExe {
	//main 메소드:첫번째로 실행.
	public static void main(String[] args) {
//		printStar();
//		printStar(3);//실행부분은 타입을 적지않는다. ex)printStar(int 3)
//		printCircle("＠");
//		printCircle("@",5);
		int result=sum(sum(2,3),sum(3,4));
		System.out.println("최종값은"+result);
	}
	public static void printStar() { //반환값:없음.매개변수:없음
		System.out.println("★");
	}
	public static void printStar(int times) {//반환값:없음.매개변수:있음
		for(int i=0; i<times;i++) {
			System.out.println("★");
		}
	}
	public static void printCircle(String circle) {
		System.out.println(circle);
	}
	//출력하는 모양,갯수 받아와서 출력.
	public static void printCircle(String circle,int times) {
		for(int i=0; i<times;i++) {
			System.out.println(circle);
		}
	}
	//반환값을 가지는 메소드
	public static int sum(int n1,int n2) {
		int result=n1*2+n2*3;
		System.out.println("결과값은"+result);
		return result;//반환값의 유형은 int
	}
}
