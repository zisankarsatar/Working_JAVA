class Machine {
	public String name;
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started.");
	}

	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class App {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		Camera camera1 = new Camera();

		mach1.start();
		mach1.name="Say my name";
		camera1.start();
		camera1.snap();
		camera1.name="Guetta";

		// Upcasting
		Machine machine2 = camera1;
		machine2.start();
		machine2.name="J Balvin";
		// error: machine2.snap();

		// Downcasting
		Machine machine3 = new Camera();
		machine3.name="Without me";
		machine3.start();
		//error: machine3.snap();
		
		Camera camera2 = (Camera) machine3;
		camera2.name="Sia";
		camera2.start();
		camera2.snap();
		
		// Doesn't work --- runtime error.
       /* Machine machine4 = new Machine();
        Camera camera3 = (Camera)machine4;
        camera3.name="Elastic";
        camera3.start();
        camera3.snap();*/        

	}
}
