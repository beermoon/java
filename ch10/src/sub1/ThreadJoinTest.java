package sub1;

/*
 * 날짜 : 2025/01/20
 * 이름 : 최명기
 * 내용 : JAVA 스레드 (Thread) 실습하기
 * 
 */

class WorkThread extends Thread {
	
	@Override
	public void run() {
		
		for (int i =0; i < 10; i++) {
			System.out.println("WorkThread..." + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


public class ThreadJoinTest {
	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		
		// 스레드 실행
		work.start();
		
		// 스레드 종료대기
		try {
			// Main 스레드가 Work 스레드 종료 대기 
			work.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료..");	// 프로그램 종료.
		
		
		
	}
	
}
