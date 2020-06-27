
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=0;
		Machine mach1 = new Machine();

		mach1.start();
		mach1.stop();
		age=mach1.age;
		
		System.out.println(age);
		Car car = new Car();
		car.start();
		car.say();
	}

}
