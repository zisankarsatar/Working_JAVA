
public class Robot {
	private int id;

	public Robot(int id) {
		this.id = id;
	}

	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}

	// statik iç sýnýflarýn örnek verilere eriþimi yoktur.
	// Gruplandýrýlmýþ olmalarý dýþýnda gerçekten "normal" sýnýflar gibidirler
	// bir dýþ sýnýf içinde. Sýnýflarý birlikte gruplandýrmak için kullanýn.
	public static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	
	public void start() {
		System.out.println("Starting robot " + id);

		// Beyin Kullan. Beyin örneðimiz yokbir tane oluþturana kadar. 
		//Beyin örnekleri
		Brain brain = new Brain();
		brain.think();

		final String name = "Robert";

		// Sometimes it's useful to create local classes
		// within methods. You can use them only within the method.
		class Temp {
			public void doSomething() {
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}

		Temp temp = new Temp();
		temp.doSomething();
	}
}
