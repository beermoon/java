package sub4;

public class Doctor extends Person {
	
	
	private String specialty;

	public Doctor(String name,String  specialty, int age) {
		super(name,age);
		
		this.specialty = specialty;
		
		
		
	}
	
	public void work() {
		this.introduce();
		System.out.println("저는 의시이며 전공은" + specialty + "입니다" );
		
	}
	
	
	
}
