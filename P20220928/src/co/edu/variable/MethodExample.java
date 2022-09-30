package co.edu.variable;

public class MethodExample {
	public static void main(String[] args) {
		int result=getArea(20,15);
		System.out.println("전체 너비는"+result);
		
		int[] intAry= {23,45,12};
		result=sumAry(intAry);
		System.out.println("전체 배열요소의 합계는"+result);
		
		int[] intAry2= {23,20,45,12};
		result=sumAry(intAry2);
		System.out.println("전체 배열요소의 합계는"+result);
//		int sum=0;
//		for(int i=0;i<intAry.length;i++) {
//			sum=sum+intAry[i];
//		}
		
		//실수. float, double
		double d1=23.4567;
		double d2=12.34;
		double d3=d1+d1;
		d3=divide(d1,d2);
		System.out.println("나눈 결과는"+d3);
		
		d3=divide(3,0);
		System.out.println("나눈 결과는"+d3);
	}
	//가로,세로 => 
	public static int getArea(int a,int b) {
		int result=a*b;
		return result;
	}
	//배열요소의 각 값의 합.
	public static int sumAry(int[] ary) {
		int result=0;
		for(int i=0; i<ary.length;i++) {
			result=result+ary[i];
		}
		return result;
	}
	
	//두수의 나눈 결과를 반환.
	public static double divide(double n1, double n2) {
		double result=n1/n2;
		return result;
	}
	
	//두수의 나는 작업. 매개변수를 int 지정
	public static double divide(int n1,int n2) {
		//1bit*8=1byte
		//유형:byte(1),short(2),int(4),long(8)
		//	:float(4),double(8)
		if(n2==0) {
			return 0;
		}
		double result=n1/n2; // 3/2=>1.5
		return result;
	}
}
