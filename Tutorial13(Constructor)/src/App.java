class Machine{
	private String name;
	private int code;
	
	public Machine() {
		this("Berk",88);
		System.out.println("Constructor running");
	}
	
	public Machine(String name) {
		System.out.println("Second constructor");
		this.name=name;
	}
	
	public Machine(String name, int code) {
		System.out.println("Third constructor");
		this.name=name;
		this.code=code;
		System.out.println(name);
		System.out.println(code);
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine();
		
		new Machine();
		Machine machine2 = new Machine("Enis");
		Machine machine3 = new Machine("Murat",5);
	}

}
