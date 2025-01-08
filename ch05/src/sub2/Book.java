package sub2;

public class Book {

	// 속성
	private String title;
	private String author;
	private String isbn;
	private int avaliableCopies;
	
	
	 // 생성자 
	public Book (String title,String author, String isbn, int avaliableCopies) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.avaliableCopies = avaliableCopies;
	}
	
	// 기능
	public boolean  borrowBook() {
		if(avaliableCopies >= 1) {
			  avaliableCopies--;
					return true;
		} else {
			return false;
		}
	}
	
	public void returnBook() {
		 avaliableCopies++;
	}
	
	public void show() {
		System.out.println("---------------");
		System.out.println("책 제목 : " + title);
		System.out.println("책 저자 : " + author);
		System.out.println("ISBN 번호 : " + isbn);
		System.out.println("도서 수 : " + avaliableCopies);

	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getAvaliableCopies() {
		return avaliableCopies;
	}
	public void setAvaliableCopies(int avaliableCopies) {
		this.avaliableCopies = avaliableCopies;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
