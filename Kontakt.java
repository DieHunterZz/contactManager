

public class Kontakt {
	String name;
	String Telefonnumer;
	
	
	public Kontakt(String name, String telefonnumer) {
		this.name=name;
		this.Telefonnumer=telefonnumer;
}
	public String getName() {
		return this.name;
	}
	
	public String getTelefonnumer() {
		return this.Telefonnumer;
	}
	
	public String toString() {
		return this.name + " " + this.Telefonnumer;
	}
}
