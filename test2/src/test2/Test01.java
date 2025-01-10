package test2;

/*
 * 날짜 : 2025/01/10
 * 이름 : 최명기
 * 내용 : 자바 배열 문자 출력 연습문제
 * 
 */



public class Test01 {
	public static void main(String[] args) {
		
		char str [] = {'I',' ','L','O','V','E',' ','Y','O','U'};
		int row , col;
		
		
		
		
		for( row = 1; row < 10; row++) {
			for (col = 0; col <= row; col++) {
				System.out.print(str[col]);
			}
				System.out.println("\n");
		}
	}
}
