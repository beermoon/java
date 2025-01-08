package sub3;

/*
 * 날짜 : 2025/01/08
 * 이름 : 최명기
 * 내용 : Java 클래스 변수, 클래스 메서드 실습
 */

public class StaticTest {

	public static void main(String[] args) {
		
		
		// 정적 변수, 정적 메서드
		Car sonata = new Car("소나타","흰색",10);
		Car avate = new Car("아반떼","검정",20);
		Car grande = new Car("그랜져","은색",30);
		
		sonata.show();
		avate.show();
		grande.show();
		
		// 전체 차량 수 클래스 변수
		System.out.println("전체 차량 수 :  " + Car.count);
		
		// 전체 차량 수 클래스 메서드
		System.out.println("전체 차량 수 : " + Car.getCount());
		
		// Increment 실습
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();

		
		// 싱글톤 연습
		Calc c1 = Calc.getInstance();
				
				
		int result1 = c1.plus(1,2);
		System.out.println("result1 : " + result1);
		
		Calc c2 = Calc.getInstance();
		
	    int result2 = c2.minus(1, 2);
	    System.out.println("result2 :  " + result2);
		
	}
	
	
	
}
