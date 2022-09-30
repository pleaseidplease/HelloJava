package co.edu.variable;

public class Account {
	private String accNo;//두단어의 조합:2번째 첫번째 대문자.
	private String owner;//예금주.
	private int balance;//예금액.
	
	//setter, getter 정의
	void setAc(String accNo) {
		this.accNo=accNo;
	}
	String getAc() {
		return this.accNo;
	}
	void setOn(String owner) {
		this.owner=owner;
	}
	String getOn() {
		return this.owner;
	}
	void setbal(int balance) {
		this.balance=balance;
	}
	int getbal() {
		return this.balance;
	}
}
