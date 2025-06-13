
public class Kontakttest {

	
	
		 public static void main(String[] args) {
		        KontaktVerwalten verwaltung = new KontaktVerwalten();

		        Kontakt k1 = new Kontakt("Ismail", "015752890983");
		        Kontakt k2 = new Kontakt("Zahra", "0198903487");

		        verwaltung.addKontakt(k1);
		        verwaltung.addKontakt(k2);
		        
		        verwaltung.getKontakte();
		        
		        verwaltung.call(k1);
		        
		        Kontakt k3 = new Kontakt("ismail", "0122349845"); // neue Nummer
		        verwaltung.updateKontakt(k1, k3);
		        
		        verwaltung.getKontakte();
		        
		        verwaltung.deleteKontakt(k2);
		        verwaltung.getKontakte();
		    
	}

}
