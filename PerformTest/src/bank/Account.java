package bank;

public class Account {
	
	// 변수 선언 캡슐화
	private String  ano;
	private String owner;
	private int balance;
	
	
	// 생성자 
	public  Account(String ano , String owner , int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	// Getter Setter 메서드
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}

	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
