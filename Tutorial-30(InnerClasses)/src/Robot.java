
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

	// statik i� s�n�flar�n �rnek verilere eri�imi yoktur.
	// Grupland�r�lm�� olmalar� d���nda ger�ekten "normal" s�n�flar gibidirler
	// bir d�� s�n�f i�inde. S�n�flar� birlikte grupland�rmak i�in kullan�n.
	public static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	
	public void start() {
		System.out.println("Starting robot " + id);

		// Beyin Kullan. Beyin �rne�imiz yokbir tane olu�turana kadar. 
		//Beyin �rnekleri
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
