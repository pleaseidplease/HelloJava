package co.edu.inherit.dbinterface;

public class MysqlDAO implements DaoService {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("mysql 삽입");
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("mysql 변경");
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("mysql 제거");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("mysql 조회");
	}
//	public void insert() {
//		System.out.println("mysql 저장.");
//	}
//	public void search() {
//		System.out.println("mysql 조회");
//	}
//	public void delete() {
//		System.out.println("mysql 삭제.");
//	}
//	public void update() {
//		System.out.println("mysql 수정.");
//	}
}	
