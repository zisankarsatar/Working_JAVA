class Plant {

	// Genellikle yalnýzca statik nihai üyeler herkese açýktýr
	public static final int ID = 7;
	
	// Örnek deðiþkenleri özel olarak bildirilmelidir,
	//veya en azýndan korumalý
	private String name;
	

	// Yalnýzca sýnýf dýþýnda kullanýlmasý amaçlanan yöntemler
	// herkese açýk olmalýdýr. Bu yöntemler belgelenmelidir
	// kodunuzu daðýtýrsanýz dikkatlice.
	public String getData() {
		String data = "Starboy"+hesapMakinesi();

		return data;
	}
	

	// Yalnýzca sýnýfýn kendisinde kullanýlan yöntemler
	// özel veya korumalý olun.
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
