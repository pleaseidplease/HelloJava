package co.edu.board;

import java.util.Scanner;

//기능만.
public class BoardDAO {
	//Singleton 방식의 인스턴스 생성.
	private static BoardDAO instance=new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		return instance;
	}
	
	Scanner scn=new Scanner(System.in);
	Board[] myBoards=new Board[100];

	//1.글등록
	public void addBoard() {
		System.out.println("글등록 기능.");
		System.out.println("글번호 입력>>>>");
		int bNo=scn.nextInt();
		scn.nextLine();
		System.out.println("글제목 입력>>>>");
		String title=scn.nextLine();
		System.out.println("글내용 입력>>>>");
		String content=scn.nextLine();
		
		Board brd=new Board(bNo, title, content);
		for(int i=0;i<myBoards.length;i++) {
				if(myBoards[i]==null) {
					myBoards[i]=brd;
					break;
				}
			}
		}

	//2.글목록
	public void boardList() {
		System.out.println("글목록 기능");
		for(Board brd:myBoards) {
			if(brd!=null) {
				System.out.println(brd.toString());
			}
		}
	}
	//3.글상세보기
	public void boardDetail() {
		System.out.println("상세보기 기능 상세보기할 번호를 입력하세요");
		int bD=scn.nextInt();
		for(int i=0;i<myBoards.length;i++){
				if(myBoards[i]!=null&&myBoards[i].getBoardNo()==bD) {
						System.out.println(myBoards[i].toString());
					}
				else {
					System.out.println("저장된 정보가 없습니다.");
					break;
				}
		}
	}
	//4.글삭제
	public void delBoard() {
		System.out.println("글삭제 기능");
		int bD=scn.nextInt();
		for(int i=0;i<myBoards.length;i++){
				if(myBoards[i]!=null&&myBoards[i].getBoardNo()==bD) {
					myBoards[i]=null;
					System.out.println("글이 삭제되었습니다.");
				}
		}
		}
	//5.전체메뉴
	public void exe() {
		
		boolean run=true;
		while(run) {
			System.out.println("1.글등록 2.글목록 3.글상세보기 4.글삭제 9.종료");
			System.out.println("선택>> ");
			int menu=scn.nextInt();
			switch(menu) {
			case 1: addBoard();break;
			case 2:boardList(); break;
			case 3:boardDetail(); break;
			case 4:delBoard();break;
			case 9:
				run=false;
				break;
				default:
					System.out.println();
			}
		}//end of while
		System.out.println("프로그램 종료.");
	}//end of exe()
	
}
