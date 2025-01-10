package test3;

interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}

class Customers ???  {
	
	@Override 
	public void sell() {
		System.out.println("판매하기");
	}
	
	@Override
	public void buy() {
		System.out.println("구매하기");
	}
}


public class Test10 {

	public static void main(String[] args) {
		Buyer buyer = new buy();
		Seller seller = new sell();
		
		buyer.buy();
		seller.sell();

	}

}
