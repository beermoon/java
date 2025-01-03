package test1;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 값 입력 :");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 :");
		int y = sc.nextInt();
		
		
		
		String result = x > y ? "x가 더 큽니다" : "y가 더 큽니다";
		
		System.out.println(result);
		
		
		
	}

}
