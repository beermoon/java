package sub2;

/*
 * 날짜 : 2025/01/20
 * 이름 : 최명기
 * 내용 : JAVA 스레드 Interrupt 실습하기
 * 
 */

class SubThread extends Thread {
	
	@Override
	public void run() {
		
		int i = 1;
		
		while (true) {
			
			System.out.println("SubThread 실행 ..." + i);
			i++;
			
			try {
				while(true) {
					System.out.println("SubThread 실행 ..");
					i++;
					
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}


public class ThreadInterruptTest {

	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		
		sub.start();
		
		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) { // 10초 대기
			e.printStackTrace();
		}	
		
		
		// 서브 스레드 일시정지 상태에서 종료상태로
		sub.interrupt();
		
		System.out.println("메인 스레드 종료..");
		
	}
	
	
}
