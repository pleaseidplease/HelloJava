package co.edu.inherit.friend;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendExe {
	Scanner scn=new Scanner(System.in);
//	Friend[] friends=new Friend[10];
	ArrayList friends=new ArrayList();
	//친구등록 - 학교/회사/친구...
	public void exe() {
		while(true) {
			System.out.println("1.등록 2.조회 3.종료");
			System.out.println("선택>>>");
			int menu=scn.nextInt();
			if(menu==1) {
				System.out.println("1.회사친구 2.학교친구 3.친구");
				int subMenu=scn.nextInt();
				if(subMenu==1) {
					addComFriend();
				}else if(subMenu==2) {
					addUnivFriend();
				}else if(subMenu==3) {
					addFriend();
					
				}
			}else if(menu==2) {
				searchFriend();
			}else if(menu==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		}
		System.out.println("프로그램 종료.");
	}//end of exe()
	//추가메소드.
	
	public void addComFriend() {
		scn.nextLine();
		System.out.println("회사친구의 이름을 등록하세요");
		String name=scn.nextLine();
		
		System.out.println("회사친구의 전화번호를 등록하세요");
		String phone=scn.nextLine();
		System.out.println("회사친구의 회사를 등록하세요");
		String company=scn.nextLine();
		System.out.println("회사친구의 부서를 등록하세요");
		String dept=scn.nextLine();
		ComFriend com=new ComFriend(name,phone,company,dept);
		for(int i=0;i<friends.size();i++) {
			if(friends.get(i)==null) {
				friends.add(com);
				break;
			}
		}
		System.out.println("등록이 완료되었습니다.");
	}
	public void addUnivFriend() {
		UnivFriend univ=new UnivFriend();
		scn.nextLine();
		System.out.println("친구의 이름을 등록하세요");
		String name=scn.nextLine();
		
		System.out.println("친구의 전화번호를 등록하세요");
		String phone=scn.nextLine();
		System.out.println("친구의 대학을 등록하세요");
		String unive=scn.nextLine();
		System.out.println("친구의 전공을 등록하세요");
		String major=scn.nextLine();
		univ.setName(name);
		univ.setPhone(phone);
		univ.setUniv(unive);
		univ.setMajor(major);
		for(int i=0;i<friends.size();i++) {
			if(friends.get(i)==null) {
				friends.add(univ);
				break;
			}
		}
		System.out.println("등록이 완료되었습니다.");
	}
	public void addFriend() {
		scn.nextLine();
		System.out.println("친구의 이름을 등록하세요");
		String name=scn.nextLine();
		
		System.out.println("친구의 전화번호를 등록하세요");
		String phone=scn.nextLine();

		Friend fri=new Friend(name,phone);
		for(int i=0;i<friends.size();i++) {
			if(friends.get(i)==null) {
				friends.add(fri);
				break;
			}
		}
		System.out.println("등록이 완료되었습니다.");
	}
	public void searchFriend() {
		
		System.out.println("조회할 친구의 이름을 검색해주세요.");
		scn.nextLine();
		String name=scn.nextLine();
		
//		for(int i=0;i<friends.size();i++) {
//			if(friends.get(i)!=null&&friends.get(i).equals(name)) {
//				System.out.println("조회된 결과는 "+friends.get(i)+"입니다.");
//				break;
//			}else {
//				System.out.println("일치하는 정보가 없습니다.");
//				break;
//			}
		
		for(int i=0; i<friends.size();i++) {
			//Friend 클래스의 상속. Friend,ComFriend,UnivFriend
			Object frnd=(Friend)friends.get(i);
			if(frnd instanceof Friend) {
				Friend friend=(Friend)frnd;
				System.out.println(friend.showInfo());
			}else if (frnd instanceof ComFriend) {
				ComFriend friend=(ComFriend)frnd;
				System.out.println(friend.showInfo());
			}else if (frnd instanceof UnivFriend) {
				UnivFriend friend=(UnivFriend)frnd;
				System.out.println(friend.showInfo());
			}
			System.out.println(frnd.showInfo());
		}
		
//		System.out.println("찾을 친구이름 입력>>");
//		String searchKey=scn.nextLine();
//		for(int i=0;i<friends.length;i++) {
//			if(friends[i]!=null&&friends[i].getName().contains(searchkey))
//					System.out.println(friends[i].showInfo());
//		}
	}
}

