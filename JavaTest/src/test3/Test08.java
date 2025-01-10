package test3;


class Product {
	private String category;
	private int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void Product() {}
}

class Television {
	public Television(String category, int price) {
		super(category, price);
	}
	
	@Override
	public void info() {
		System.out.println("제품분류 : " +category);
		System.out.println("제품가격 : " +price);
	}
}

class Computer {
	public Computer(String category, int price) {
		super(category,price);
	}
	@Override
	public void info( ) {
		System.out.println("제품분류 : " +category);
		System.out.println("제품가격 : " +price);
	}
}

public class Test08 {

	public static void main(String[] args) {
		Television p1 = new Television("가전",100);
		Computer p2 = new Computer("컴퓨터",150);
		
		p1.info();
		p2.info();

	}

}
