package esercizioGiorno2.es2;

public class Sim {
String numeroTelefono;
double credito = 0;
Chiamata[] chiamateEffettuate = new Chiamata[5];
double costoChiamata = 0.2;

//COSTRUTTORE
public Sim(String numeroTelefono) {
	this.numeroTelefono = numeroTelefono;
}

//METODO STAMPA A SCHERMO DATI SIM
public void stampaDatiSim() {
	System.out.println("N° TELEFONO: " + numeroTelefono);
	System.out.println("CREDITO: " + credito);
	System.out.println("CHIAMATE EFFETTUATE:");
	for (Chiamata chiamata : chiamateEffettuate) {
		if (chiamata != null) {
			System.out.println("N° TELEFONO: " + chiamata.numero + ", Durata: " + chiamata.durataChiamata);
		}
	}
}

//METODO PER EFFETTUARE LE CHIAMATE
public void effetuaChiamata(String numero, int durataChiamata) {
	for(int i = 0; i < chiamateEffettuate.length; i++) {
		if(chiamateEffettuate[i] == null) {
			chiamateEffettuate[i] = new Chiamata(numero, durataChiamata);
			break;
		}
	}
}

//METODO PER EFFETTUARE UNA RICARICA
public void ricarica(double ricarica) {
	this.credito += ricarica;
}

// METODO PER CALCOLARE IL CREDITO RESIDUO DOPO UNA CHIAMATA
public double calcolaCreditoResiduo(int durataChiamata) {
    return credito - (durataChiamata * costoChiamata);
}
}
