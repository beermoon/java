package test4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			// 두 정수 입력
			System.out.print("첫 번째 정수를 입력하세요: ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 정수를 입력하세요: ");
			int num2 = sc.nextInt();
			
			int result = num1 / num2;
			
			System.out.println("결과: " + result);
			
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다. 정수를 입력하세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		System.out.println("프로그램 정상 종료");

	}

}
