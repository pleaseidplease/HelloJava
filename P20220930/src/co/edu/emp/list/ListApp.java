package co.edu.emp.list;

import java.util.ArrayList;

import co.edu.emp.Employee;

public class ListApp {
	public static void main(String[] args) {
		//배열 -> 컬렉션(ArrayList,HashSet,HashMap)
		String[] strAry=new String[10];
//		ArrayList list=new ArrayList();
		//Object <= - 모든 클래스
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hello");
		list.add("Employee");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<Integer> intlist=new ArrayList<Integer>();
		intlist.add(100);
//		intlist.add("100");
		ArrayList<Employee>  emplist=new ArrayList<Employee>();
		emplist.add(new Employee());
//		emplist.add(100);
		emplist.add(new Employee(100,"홍길동",1000));
		emplist.add(new Employee(200,"김민수",2000));
		emplist.add(new Employee(300,"박인기",3000));
		emplist.add(new Employee(400,"황석용",4000));
		String result=null;
		int salary=0;
		for(int i=0;i<emplist.size();i++) {
			if(emplist.get(i).getEmployeeId()==200) {
				result=emplist.get(i).getName();
				salary=emplist.get(i).getSalary();
			}
		}
		System.out.println("이름은 "+result+"이고 급여는 "+salary+"입니다.");
		
	}
}
