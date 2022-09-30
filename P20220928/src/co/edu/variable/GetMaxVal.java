package co.edu.variable;

public class GetMaxVal {
	public static void main(String[] args) {
		int[] randomAry = new int [5];
		randomAry[0]=(int)(Math.random()*100)+1;//0~100사이의 임의수 생선.
		randomAry[1]=(int)(Math.random()*100)+1;
		randomAry[2]=(int)(Math.random()*100)+1;
		randomAry[3]=(int)(Math.random()*100)+1;
		randomAry[4]=(int)(Math.random()*100)+1;
		
		int minVal=randomAry[0];
		int maxVal=0;//배열요소 중 가장 큰값을 저장.
		for(int i=0; i<5;i++) {
			System.out.println(randomAry[i]);	
			
			//maxVal 변수에 두 값을 비교해서 큰값을 담기.
			if(randomAry[i]>maxVal) {
				maxVal=randomAry[i];
			}
			if(minVal>randomAry[i]) {
				minVal=randomAry[i];
			}
		}			
		System.out.println("생성된 배열의 임의의 값중 최대값=>"+maxVal);
		System.out.println("생성된 배열의 임의의 값중 최소값=>"+minVal);
		
		
	}
	
}
