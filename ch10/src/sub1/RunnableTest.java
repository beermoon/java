package sub1;


/*
 * 날짜 : 2025/01/20
 * 이름 : 최명기
 * 내용 : JAVA 스레드 (Thread) 실습하기
 * 
 */


// 쓰레드 작업을 위한 Runnable 구현체 정의
class RunnableImpl implements Runnable {

	private String name;
	
	public RunnableImpl(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i<10; i++) {
			
			System.out.println(name + "스레드 실현 중..");
			
			try {
				Thread.sleep(1000);	// 1초대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

public class RunnableTest {
	public static void main(String[] args) {
		
		
		// Runnable 객체 생성
		RunnableImpl run1 = new RunnableImpl("작업1");
		RunnableImpl run2 = new RunnableImpl("작업2");
		
		// Thread 생성
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run1);
		
		// Thread 실행
		t1.start();
		t2.start();
		
		// 메인스레드 작업
		

		for (int i = 0; i<10; i++) {
			
			System.out.println("스레드 실현 중..");
			
			try {
				Thread.sleep(1000);	// 1초대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
	}
}

