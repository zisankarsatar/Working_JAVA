
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mach1 = new Machine();
		mach1.start();
		
		Person per1 = new Person("Zizi");
		per1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2=per1;
		info2.showInfo();
		
		System.out.println();
		
		outputInfo(mach1);
		outputInfo(per1);
		
		
	}
	private static void outputInfo(Info info) {
        info.showInfo();
    }

}
