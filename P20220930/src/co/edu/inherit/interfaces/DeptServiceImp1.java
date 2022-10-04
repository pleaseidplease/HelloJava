package co.edu.inherit.interfaces;

public class DeptServiceImp1 implements DaoService{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("부서 저장");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("부서 조회");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("부서 삭제");
	}

}
