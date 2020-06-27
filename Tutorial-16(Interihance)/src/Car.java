
public class Car extends Machine{
	
	
	@Override
	public void start() {
		System.out.println("Car is start");
	}

	
	@Override
	public void stop() {
		System.out.println("Car is stop");
	}


	public void say() {
		System.out.println("Hello");
	}
}
