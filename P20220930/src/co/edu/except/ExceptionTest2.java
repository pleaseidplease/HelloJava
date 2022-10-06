package co.edu.except;
class NegativeValException extends Exception{
	NegativeValException() {
		// TODO Auto-generated constructor stub
	}
	NegativeValException(String msg){
		super(msg);
	}
}
public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			positiveVal(10, -20);
		} catch (NegativeValException e) {
			// TODO Auto-generated catch block
			System.out.println("예외 발생");
		}
		System.out.println("프로그램 종료");
	}
	public static int positiveVal(int n1, int n2) throws NegativeValException {
		int result=n1+n2;
		if(result<0) {
			throw new NegativeValException("음의 값이 발생");
		}
		return result;
	}
	
}
