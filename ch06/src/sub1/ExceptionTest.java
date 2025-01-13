package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 날짜 : 2025/01/13
 * 이름 : 최명기
 * 내용 : Java 예외처리 실습하기
 */


public class ExceptionTest {
	
	public static void main(String[] args) {
		
		/////////////////////
		// 실행예외 (런타임)
		/////////////////////
		
		// 예외상황 1 - 어떤 수를 0으로 나눌때 
		int num1 = 1; 
		int num2 = 0; 
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {
			// 예외가 발생 가능한 코드 작성 
			 r4 = num1 / num2;
			
			
			
		} catch (ArithmeticException e) { // 다형성이 적용된 catch  구문
			// 예외가 발생 했을때 처리 작성
			e.printStackTrace();   // 예외내용 콘솔 출력
		}
		
		
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		// 예외상황2 - 배열 잘못된 인덱스 참조할 때
		int [] arr = {1,2,3,4,5};
		
		
		try {
		for(int i =0; i<=5;i++) {
			System.out.println(arr[i] + ",");
		}
		System.out.println();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} 
		
		// 예외 상황 3 - 객체 생성없이 
		
		try {
			animal.move();
		}catch (NullPointerException e)  {
			e.printStackTrace();
		}
		
		// 예외상황 4 - 잘못된 캐스팅
		Animal a1 = new Tiger();		// 업캐스팅(다형성)
		Animal a2 = new Eagle();	//
		
		
		if (a1 instanceof Tiger) {
		Tiger tiger = (Tiger)a1; // 다운캐스팅
		tiger.move();
		tiger.hunt();
		}
		
		try {
		Shark shark = (Shark)a2; 
		shark.move();
		shark.hunt();
		
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		
		
		/////////////////////
		// 일반예외 (컴파일 타입)
		/////////////////////
	
		// 동적 객체 생성 
		try {
		Class clazz = Class.forName("sub1.Eagle");	// sub1 패키지에 Eagle 클래스 정보 불러오기
		Constructor<?> constructor = clazz.getDeclaredConstructor();		// 생성자 선언
		Eagle eagle = (Eagle) constructor.newInstance();
		
		eagle.move();
		eagle.hunt();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (NoSuchMethodException e) {
			e.printStackTrace();
		}catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException) {
			e.printStackTrace();
		}  catch (IllegalAccessException) {
			e.printStackTrace();
		}  catch (IllegalAccessException) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("프로그램 정상 종료...");
		
	}	// main end
	
}
