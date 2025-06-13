import java.util.ArrayList;

public class KontaktVerwalten {
	ArrayList<Kontakt> kontakt;
	boolean gefunden = false;
	
	public KontaktVerwalten() {
		this.kontakt= new ArrayList<>();
	}
	//Kontakt hinzufügen
	public void addKontakt(Kontakt k) {
		kontakt.add(k);
		System.out.println("Kontakt hinzugefügt");
	}
	
	//Kontakt löschen
	public void deleteKontakt(Kontakt k) {
		
		
		for (int i =0; i<kontakt.size(); i++) {
			if(kontakt.get(i).equals(k)) {
				gefunden = true;
				kontakt.remove(i);
				System.out.println("Kontakt gelöscht.");
			}
		}
		if (gefunden == false) {
			System.out.println("Kein Kontakt mit diesem Namen gefunden.");
		}
	}
	
	//Kontakte anzeigen
	public void getKontakte() {
		if(kontakt.isEmpty()) {
			System.out.println("Kontakt Liste ist leer");
		}
		else {
			for(int i =0; i<kontakt.size(); i++) {
				System.out.println(kontakt.get(i) );
			}
		}
	}
	
	//Kontakt anrufen
	public void call(Kontakt k) {
		
		if (kontakt.isEmpty()) {
			System.out.println("Kontakt Liste ist leer");
			return;}
		
			for(int i =0; i<kontakt.size(); i++) {
					if(kontakt.get(i).equals(k)) {
						gefunden = true;
						System.out.println(kontakt.get(i) + " wird angerufen...");
					}
				
			}
		if(!gefunden) {   
			System.out.println("Kein Kontakt mit diesem Namen gefunden. ");
		}
		
		}
	// Alten Kontakt durch neuen ersetzen
	public void updateKontakt(Kontakt alt, Kontakt neu) {

	    for (int i = 0; i < kontakt.size(); i++) {
	        if (kontakt.get(i).equals(alt)) {
	            kontakt.set(i, neu);
	            gefunden = true;
	            System.out.println("Kontakt aktualisiert.");
	            break;
	        }
	    }

	    if (!gefunden) {
	        System.out.println("Kontakt zum Aktualisieren nicht gefunden.");
	    }
	}
		
	}


