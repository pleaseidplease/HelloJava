package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		
		int[] numAry= {34,12,2,91,2,2,3,6,47,8,7,2,6};
		//반복적인 처리.
//		numAry= {12,21,34};

		for(int j=0; j<numAry.length-1;j++) {
			for(int i=0; i<numAry.length-1;i++) {
				if(numAry[i]>numAry[i+1]) { //i:0
					int temp=0;
					temp=numAry[i];
					numAry[i]=numAry[i+1];
					numAry[i+1]=temp;
				}
				
			}
		}
		
		for(int n : numAry) 
		System.out.println(n);
		
	}
}
