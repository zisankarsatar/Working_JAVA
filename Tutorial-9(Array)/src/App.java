
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values;
		values= new int[3];
		
		values[0]=10;
		values[1]=20;
		values[2]=30;
		
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
		
		int[] numbers= {4,5,6};
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		String[] words = new String[3];
		
		words[0]="Zizi";
		words[1]="Naber";
		words[2]="Selam";
		
		for(String word: words) {
			System.out.println(word);
		}
		
		String[] fruits = {"apple","banana","pear","kiwi" };
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		
		
	}

}
