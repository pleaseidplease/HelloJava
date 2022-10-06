package co.edu.emp;

import java.util.ArrayList;
import java.util.Scanner;

//컬렉션을 활용해서 데이터 저장.
public class EmployeeArraylist implements EmployeeService {
	ArrayList<Employee> list;
	int idx = 0;
	Scanner scn = new Scanner(System.in);

	@Override
	public void init() {
		// TODO Auto-generated method stub
		list = new ArrayList<Employee>();
		System.out.println("초기화 완료.");
	}

	@Override
	public void input() {
		int eId, detpId, sal = 0;
		// TODO Auto-generated method stub
		System.out.println("사번>>>");
		while (true) {
			try {
				eId = Integer.parseInt(scn.nextLine());
				break;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("숫자를 입력하세요");
			}
		}

		System.out.println("이름>>>");
		String name = scn.nextLine();
		System.out.println("부서번호>>>");
		while (true) {
			try {
				detpId = Integer.parseInt(scn.nextLine());
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자를 입력하세요");
			}
		}

		System.out.println("급여>>>");
		while (true) {
			try {
				sal = Integer.parseInt(scn.nextLine());
				break;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("숫자를 입력하세요");
			}
		}
		System.out.println("이메일>>>");
		String email = scn.nextLine();
		System.out.println("등록이 완료되었습니다.");
		list.add(new Employee(eId, name, detpId, sal, email));
		
	}

	@Override
	public String search(int employeeId) {
		// TODO Auto-generated method stub
		String result = null;
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getEmployeeId()==employeeId) {
//				result=list.get(i).getName();
//				break;
//			}
//		}
		for (Employee emp : list) {
			if (emp.getDeptId() == employeeId) {
				result = emp.getName();
				break;
			}
		}
		return result;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("%5s %8s %7s\n", "사원번호", "이름", "급여");
		System.out.println("===========================\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%5d %10s %7d\n", list.get(i).getEmployeeId(), list.get(i).getName(),
					list.get(i).getDeptId());
		}
	}

	@Override
	public int searchSal(int employeeId) {
		// TODO Auto-generated method stub
		int result = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEmployeeId() == employeeId) {
				result = list.get(i).getSalary();
				break;
			}
		}
		return result;
	}
	


}
