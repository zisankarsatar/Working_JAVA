import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int value=0;
		
		do {
			System.out.println("Bir deger giriniz:");
			value= scanner.nextInt();
		}while(value != 5);
		
		System.out.println("Got"+value);

	}

}
