import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("�sminiz: ");
		String name =input.nextLine();
		
		System.out.println("�sminiz: "+ name);
		
		System.out.println("Yasiniz:");
		int age = input.nextInt();
		
		System.out.println("Yasiniz:"+age);
		
		System.out.println("Pi say�s�:");
		float pi  = input.nextFloat();
		
		System.out.println("Pi:"+pi);
				

	}

}
