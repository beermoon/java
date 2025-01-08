package sub2;

public class Movie {
	
	// 속성
	private String title;
	private String name;
	private double rating;
	private int availableSeats;
	
	// 생성자
	
	public Movie (String title, String name, double rating, int availableSeats) {
		this.title = title;
		this.name = name;
		this.rating = rating;
		this.availableSeats = availableSeats;
	}
	
	// 기능 (메서드)
	public boolean reserveSeat() {
		if (availableSeats > 0) {
			availableSeats--;
			return true;
		} else {
			return false;
		}
	}
	
	public void cancelReservation() {
		availableSeats++;
	}
	
	public void showDetails() {
		System.out.println("---------------");
		System.out.println("영화 제목 : " + this.title);
		System.out.println("감독 이름 : " + this.name);
		System.out.println("영화 평점 : " + this.rating);
		System.out.println("예약 좌석 수: " + this.availableSeats);

	}
	

}
