package co.edu.inherit.interfaces;

//구현클래스(인터페이스를 상속하는 클래스)
public class EmpServiceImp1 implements DaoService{
	private String db;
	public EmpServiceImp1() {}
	public EmpServiceImp1(String db) {
		this.db=db;
	}
	
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(db+"저장");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println(db+"찾기");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(db+"삭제");
	}

}
