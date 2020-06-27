import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
	public static void main(String[] args) {
		Test test = new Test();

		// çoklu catch blok
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't parse command file.");
		}

		// java +7 için çoklu catch
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Tüm istisnalarýn ebeveyni yakalamak için polimorfizmi kullanma
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Ýstisnalarý doðru sýrayla yakalamak önemlidir!
		// IOException önce gelemez, çünkü üst öðe
		// FileNotFoundException, bu durumda her iki istisnayý da yakalar.
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
