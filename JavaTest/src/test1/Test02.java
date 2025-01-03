package test1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int year ; 
		int birth;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = sc.nextInt();
				
				System.out.print("올해 년도 입력 : ");
		birth = sc.nextInt(); 
				
				System.out.print("올해 년도 입력 : ");
		name = sc.next();
				
		int age = year - birth; //next () 문자열 입력 메서드
		
		System.out.printf("%s 님 안녕하세요. \n 당신은 올해 만 %d 입니다",name,age);
		
		sc.close();
		
	}
	
	
	
	
	
}
