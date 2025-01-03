package test1;

public class Test04 {

	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 :" );
		int score = sc.nextInt();
		char grade;
		
		System.out.println("입력한 점수는" +score +"입니다");
		
		if (score >= 90) {
			grade = 'A';
		}else if (80 <= score < 90) {
			grade = 'B';
		}else if (70 <= score < 80) {
			grade = 'C'; 
		} else if (60 <= score < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
			
		System.out.printf("등급은 %c 입니다",grade);
			
	
}
