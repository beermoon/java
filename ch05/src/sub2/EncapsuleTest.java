package sub2;


/*
 * 날짜 : 2025/01/07
 * 이름 : 최명기
 * 내용 : Java 클래스 캡슐화 실습하기
 */


public class EncapsuleTest {

	public static void main(String[] args) {

		// Car 객체 생성 초기화 
		Car sonata = new Car("소나타","흰색",10);
		
		// 캡슐화된 속성은 외부에서  참조할 수 없음 
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 10;
		
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		/*
		 * <출력>
		 * 차량명 : 아반떼
		 * 차랑색 : 검정
		 * 현재속도 : 20
		 */
		
		
		Car avante = new Car("아반뗴","검정",0);
		avante.speedUp(40);
		avante.speedDown(20);
		avante.show();
		
		avante.setColor("흰색"); //setter를 이용해 속성 수정
		avante.show();
		
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		 은행명 : 국민은행
		 계좌번호 : 110-11-1011
		 입금주 : 김유신
		 현재잔액 : 10000
		 
		 */
		
		Account kb = new Account("국민은행","110-11-1011","김유신",10000);
		
		kb.deposit(10000);
		kb.withdraw(5000);
		kb.show();
		
		// 김유신 -> 김유진 개명
		kb.setName("김유진");
		kb.show();
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		 은행명 : 우리은행
		 계좌번호 : 110-11-1211
		 입금주 : 김춘추
		 현재잔액 : 15000
		 
		 */
		
		Account wr = new Account("우리은행","110-11-1211","최명기",10000);
		
		wr.deposit(10000);
		wr.withdraw(5000);
		wr.show();
		
		wr.setBank("유리은행");
		wr.show();
		
		Book book1 = new Book("삼국지","나관중","10001",10);
		book1.show();
		
		boolean isOk = book1.borrowBook();
		
		if(isOk) {
			System.out.println("도서 대출 성공!");
		} else {
			System.out.println("도서 대출 실패!");
		}
		
		book1.show();
		
		Book book2 = new Book("이것이 자바다","신용권","10002",0);
		book2.show();
		
		if(book2.borrowBook()) {
			System.out.println(book2.getTitle() + "도서 대출 성공!");
		}else {
			System.out.println(book2.getTitle() + "도서 대출 실패");

		}
		
		Movie movie1 = new Movie("기생충","봉준호",10.0,100);
		movie1.showDetails();
		
		
		Movie movie2 = new Movie("바로","감준호",10.0,100);
		if (movie2.reserveSeat()) {
			System.out.println("예매 성공!");
		} else {
			System.out.println("예매 실패");
		}
		
		movie2.showDetails();
		
		
		
	}

}
