class Person {
	
	String name;
	int age;
	
	void speak() {
		System.out.println("Hello");
		System.out.println("My name is "+name+ " Iam "+ age+ " years old.");
	}
	
	int hesap() {
		int yil =65 - age;
		
		return yil;
	}
	
	String getName() {
		return name;
	}
	
	public void sayName(String text, int value) {
		System.out.println(text + value);
	}
}
public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		int yas=person1.hesap();
		String name = person1.getName();
		
		person1.name="Desiyyy";
		person1.age=15;
		
		person1.sayName("HEllo canýýým",5);
		person1.speak();
		
		
		//System.out.println("yas : "+ yas);
		//System.out.println("name : "+ name);
		
		Person person2 = new Person();
		person2.name="Shtarah";
		person2.age=21;
		person2.speak();
		
		//System.out.println(person1.name);
		//System.out.println(person2.age);
				
				
	}
}
