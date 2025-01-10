package test2;

/*
 * 날짜 : 2025/01/10
 * 이름 : 최명기
 * 내용 : 자바 배열 문자 출력 연습문제
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		
		int arr[] = {17,23,18,33,58,7,26,42,92};
		
		int maxNum = arr[0];
		
		for (int i = 0; i < 9; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
			
			
		}
		System.out.println("배열 arr에서 가장 큰 수 : " + maxNum);
	}
}
