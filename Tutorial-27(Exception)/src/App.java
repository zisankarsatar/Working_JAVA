import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
	public static void main(String[] args) {
		Test test = new Test();

		// �oklu catch blok
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't parse command file.");
		}

		// java +7 i�in �oklu catch
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// T�m istisnalar�n ebeveyni yakalamak i�in polimorfizmi kullanma
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// �stisnalar� do�ru s�rayla yakalamak �nemlidir!
		// IOException �nce gelemez, ��nk� �st ��e
		// FileNotFoundException, bu durumda her iki istisnay� da yakalar.
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
