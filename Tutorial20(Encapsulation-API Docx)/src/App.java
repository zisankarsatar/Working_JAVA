class Plant {

	// Genellikle yaln�zca statik nihai �yeler herkese a��kt�r
	public static final int ID = 7;
	
	// �rnek de�i�kenleri �zel olarak bildirilmelidir,
	//veya en az�ndan korumal�
	private String name;
	

	// Yaln�zca s�n�f d���nda kullan�lmas� ama�lanan y�ntemler
	// herkese a��k olmal�d�r. Bu y�ntemler belgelenmelidir
	// kodunuzu da��t�rsan�z dikkatlice.
	public String getData() {
		String data = "Starboy"+hesapMakinesi();

		return data;
	}
	

	// Yaln�zca s�n�f�n kendisinde kullan�lan y�ntemler
	// �zel veya korumal� olun.
	private int hesapMakinesi() {
		return 9;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
}

public class App {
	public static void main(String[] args) {

	}
}
