
public class App {

	public static void main(String[] args) {

		Robot robot = new Robot(7);
		robot.start();

		// Robot.Brain brain = robot.new Brain();
		// brain.think();

		// Bu �ok tipik bir Java s�zdizimidir.
		// statik bir i� s�n�f
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
		
	}

}
