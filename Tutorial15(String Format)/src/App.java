
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String info ="";
		
		info += "Selam";
		info += " ";
		info += "JAVA";
		
		System.out.println(info);
		
		// More effecient
		StringBuilder sb = new StringBuilder();
		
		sb.append("JLO");
		sb.append(" ");
		sb.append("& Pitbull");
		
		System.out.println(sb.toString());
		
		//formating
		
		System.out.print("print deniyoruz\n");
		System.out.println("println");
		System.out.printf("sayý yazabilir %d \n", 5);
		
		for(int i=0 ; i<5; i++) {
			System.out.printf("%2d: oo\n",i);
		}
		for(int i=0 ; i<5; i++) {
			System.out.printf("%-2d: bb\n",i);
		}
		
		System.out.printf("%.2f: float\n",3.1444645);
	}

}
