package co.edu.variable;

import java.util.Scanner;

public class WhileBank {
	public static void main(String[] args) {
		bankApp();
	}

	public static void bankApp() {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		// 메뉴: 1:예금, 2:출금, 3:잔고, 4:종료
		// 10만원이 넘으면 예금안됨.
		while (run) {
			System.out.println("메뉴: 1:예금, 2:출금, 3:잔고, 4:종료");
			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				System.out.println("예금처리하는 메뉴");
				System.out.println("예금액을 입력>>>");
				int input = scn.nextInt();
				money = money + input;
				if (money > 100000) {
					money = money - input;
					System.out.println("더이상 예금할수 없습니다.");
				}
				break;
			case 2:
				System.out.println("출금처리하는 메뉴");
				System.out.println("출금액을 입력>>>");
				int output = scn.nextInt();
				money = money - output;
				if (money < 0) {
					money = money + output;
					System.out.println("더이상 출금할수 없습니다.");
				}
				break;
			case 3:
				System.out.println("잔고조회하는 메뉴");
				System.out.println("현재잔고는 : " + money);
				break;
			case 4:
				System.out.println("종료하는 메뉴");
				run = false;
			}

		} // end of while()
		System.out.println("end of pgm");
	}
}
