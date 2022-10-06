package co.edu.emp;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		EmployeeService service = new EmployeeArraylist();
		// 1.사원수(초기화) 2.사원정보입력 3.사원검색 4.사원리스트 9.종료
		while (true) {
			System.out.println("1.사원수(초기화) 2.사원정보입력 3.사원검색 4.사원리스트 5.사원급여 9.종료");
			System.out.println("선택>>");
			int menu = 0;
			while (true) {
				try {
					menu = Integer.parseInt(scn.nextLine());// "1"->1
					break;
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("숫자를 입력해주세요");
				}
			}

			if (menu == 1) {
				service.init();
			} else if (menu == 2) {
				service.input();
			} else if (menu == 3) {
				System.out.println("검색할 사원번호 입력>>>");
				int eId = Integer.parseInt(scn.nextLine()); // "100"Enter
				String name = service.search(eId);
				if (name == null) {
					System.out.println("찾는 사원정보가 없습니다.");
				} else {
					System.out.println("사원의 이름은 " + name);
				}
			} else if (menu == 4) {
				service.print();
			} else if (menu == 5) {
				// 사번을 입력하면 급여정보를 반환.
				System.out.println("검색할 사원번호 입력>>>");
				int eId = Integer.parseInt(scn.nextLine());
				int sal = service.searchSal(eId);
				if (sal == -1) {
					System.out.println("찾는 사원정보가 없습니다.");
				} else {
					System.out.println("사원의 급여은 " + sal);
				}
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}// end of main
}// end of class
