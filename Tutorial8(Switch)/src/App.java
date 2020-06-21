import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir komut girin:[start/stop]):");
		String text = scan.nextLine();
		
		switch(text) {
			case "start":
				System.out.println("Makine baþlatýldý");
				break;
			case "stop":
				System.out.println("Makine Durdu");
				break;
			default:
				System.out.println("Komut anlaþýlamadý");
		}
	}

}
