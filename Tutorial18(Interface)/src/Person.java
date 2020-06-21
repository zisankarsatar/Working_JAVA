
public class Person implements Info {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void greet() {
		System.out.println("Hello there");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Person name is : " +name);
	}
	
	
}
