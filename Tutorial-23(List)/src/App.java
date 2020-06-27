import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}
public class App {

	public static void main(String[] args) {

		// Java 5 ^ten önce
		ArrayList list = new ArrayList();

		list.add("apple");
		list.add("banana");
		list.add("orange");

		String fruit = (String) list.get(1);
		System.out.println(fruit);

		//Þimdi
		ArrayList<String> animalList = new ArrayList<String>();

		animalList.add("cat");
		animalList.add("dog");
		animalList.add("alligator");

		String animal = animalList.get(1);
		System.out.println(animal);
		
		//Birden fazla argüman olabilir
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
		 
		 //Java 7'de
		 ArrayList<Animal> someList = new ArrayList<>();
	}

}
