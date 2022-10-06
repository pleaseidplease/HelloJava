package co.edu.emp;

public class RectPrint {
	public static void main(String[] args) {
//		int cnt=1;
//		int cnt2=1;
//		for(int i=0;i<5;i++) {
//			
//			for(int j=0;j<5;j++) {
//				
//				System.out.printf("%3d",cnt);
//				cnt=cnt+5;
//				if(cnt==26) {
//					cnt=2;
//				}else if(cnt==27) {
//					cnt=3;
//				}else if(cnt==28) {
//					cnt=4;
//				}else if(cnt==29) {
//					cnt=5;
//				}
//			}
//			System.out.println();
//		}
		
		int cnt=1;
		int cnt2=1;
		for(int i=0;i<5;i++) {
			cnt=cnt2;
			for(int j=0;j<5;j++) {				
				System.out.printf("%3d",cnt);
				cnt=cnt+5;
				if(j==4) {
					cnt2++;
				}
			}
			System.out.println();
		}
		
//		int cnt=1;
//		for(int i=0; i<26; i++) {
//			cnt=cnt+5;
//			
//			if(i%5==0) {
//				System.out.println("\n");
//				cnt=i/5+1;
//			}
//			System.out.printf("%3d",cnt);
//			
//		}
		
	}
}
