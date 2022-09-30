package co.edu.variable;

import java.util.Scanner;
import java.lang.System;

//java.lang 이 베이스 패키지
public class GetSameVal {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in); //사용자입력값을 저장.
		System.out.println("이름을 입력하세요>>>>");
		String name=scn.nextLine();// 사용자 입력값을 반환.
		String[] names= {"김현지","김유리","남미주","송지은"};
		System.out.println("입력값:"+name);
		boolean ischecked=false;
		
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(name)) {
				System.out.println("동일한 이름은"+(i+1)+"번째 있습니다.");
				ischecked=true;
				break;
				}
		}
		
		if(ischecked=false) {
			System.out.println("동일 이름이 없습니다.");
		}
		scn.close();
	}
}

