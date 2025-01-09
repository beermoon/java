package sub4;

public class Engineer extends Person {

	
	
	private String field;
	

	public Engineer(String name,String  field, int age) {
		super(name,age);
		this.field = field;
		
		
		
	}
	
	public void work() {
		super.introduce();
		System.out.println("저는 의시이며 전공은" + field + "입니다" );
		
	}
	
	
	
}

