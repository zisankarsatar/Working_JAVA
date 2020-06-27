class Frog{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getAd() {
		return name;
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1 = new Frog();
		
		frog1.setName("Ela");
		
		System.out.println(frog1.getAd());
		
		frog1.setName("Meryem");
		
		System.out.println(frog1.getAd());
	}

}
