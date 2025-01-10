package test2;

/*
 * 날짜 : 2025/01/10
 * 이름 : 최명기
 * 내용 : 자바 배열 문자 출력 연습문제
 * 
 */

public class Test03 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		// 현재 배열 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i] + ", ");
		}
		
		System.out.println("\n");
		
		// 배열의 원소를 역순으로 정렬
		for (int k = 0;  k < 5; k ++) {
			int temp = arr[k];
			arr[k] = arr[9-k];
			arr[9 - k] = temp;
		}
		
		// 역순으로 정렬된 배열 출력
		for(int n : arr ) {
				System.out.println(n + ",  ");
		
	}
	}

}
