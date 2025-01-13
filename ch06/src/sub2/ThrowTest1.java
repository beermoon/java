package sub2;

/*
 * 날짜 : 2025/01/13
 * 이름 : 최명기
 * 내용 : Java 예외처리 실습하기
 */

// 사용자 정의 예외 클래스 
class MinusException extends Exception {
	
	public MinusException(String message) {
		super(message);
	}
	
}

class OverException extends Exception {
	public OverException(String message) {
		super(message);
	}
}

class Score {
	public void check(int score) {
		
		if (score < 0) {
			// 예외 던지기 
			
		} else if (score > 100) {
			// 예외 던지기
			
		} else {
			System.out.println("점수 이상 없습니다. ");
		}
	}
}

public class ThrowTest1 {

	public static void main(String[] args) {

		
		
	}
	
}
