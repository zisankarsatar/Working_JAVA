class Thing {
	public final static int LUCKY_NUMBER = 7;
	public static int Change_Number;
	public static int Number = 50;
	public String name="busra";
	public static String description = "aciklama";
	
	public Thing() {
		Change_Number=78788;
		Number = 789545613;
	}
	public void showName() {
		System.out.println(name);
	}
	
	public static void showInfo() {
		System.out.println("static");
		//won^t woork System.out.println(name);
		System.out.println(description);
	}

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thing.showInfo();
		//Thing.description="ccrayzz";
		
		//System.out.println(Thing.Change_Number);
		//System.out.println(Thing.description);
		System.out.println(Thing.Number);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		//thing1.description="hello";
		//thing1.showInfo();
		
		thing1.name="Bella";
		thing2.name="Carlos";
		
		//System.out.println(thing1.description);
		System.out.println(thing1.Number);
		//System.out.println(Math.PI);
		//System.out.println(Thing.LUCKY_NUMBER);
		//System.out.println(thing1.Change_Number);
		//System.out.println(Thing.Change_Number);
		
		
	}

}
