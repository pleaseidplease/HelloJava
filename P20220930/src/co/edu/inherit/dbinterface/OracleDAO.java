package co.edu.inherit.dbinterface;

public class OracleDAO implements DaoService{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("oracle 저장");
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("oracle 수정");
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("oracle 삭제");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("oracle 조회");
	}
	//추가,수정,삭제,조회.
//	public void add() {
//		System.out.println("oracle 저장");
//	}
//	public void modify() {
//		System.out.println("oracle 수정.");
//	}
//	public void find() {
//		System.out.println("oracle 조회.");
//	}
//	public void remove() {
//		System.out.println("oracle 삭제.");
//	}

}
