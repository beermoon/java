package level1;

import java.util.Scanner;

public class N_2588 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int a,b;
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println((b % 10) * a );
			System.out.println(((b / 10) % 10) * a);	// 10의 자리
			System.out.println((b / 100)  * a);
			System.out.println(a * b);
		}
}
