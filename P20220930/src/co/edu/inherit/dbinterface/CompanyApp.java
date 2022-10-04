package co.edu.inherit.dbinterface;

public class CompanyApp {
	public static void main(String[] args) {
//		MysqlDAO dao=new MysqlDAO();
//		dao.insert();
//		dao.update();
//		dao.search();
//		dao.delete();
//		
//		OracleDAO dao= new OracleDAO();
//		dao.add();
//		dao.modify();
//		dao.find();
//		dao.remove();
		
		DaoService dao=new MysqlDAO();
		dao=new OracleDAO();
		dao.insert();
		dao.modify();
		dao.remove();
		dao.search();
		
		//익명구현객체:인터페이스 구현코드.
		DaoService anonym=new DaoService() {
			
			@Override
			public void search() {
				// TODO Auto-generated method stub
				System.out.println("익명db 조회.");
			}
			
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				System.out.println("익명db 삭제.");
			}
			
			@Override
			public void modify() {
				// TODO Auto-generated method stub
				System.out.println("익명db 수정.");
			}
			
			@Override
			public void insert() {
				// TODO Auto-generated method stub
				System.out.println("익명db 입력.");
			}
		};
		anonym.insert();
		anonym.search();
		anonym.remove();
		anonym.modify();
		
		
	}
}
