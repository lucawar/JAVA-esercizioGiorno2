package esercizioGiorno2.es1;

public class Rettangolo {
double altezza;
double larghezza;

//COSTRUTTORE
public Rettangolo(double altezza, double larghezza) {
	this.altezza = altezza;
	this.larghezza = larghezza;
}

//----------------METODI--------------

//METODO CALCOLO PEIMETRO
public double calcolaPerimetro() {
	return 2* (altezza * larghezza);
}

//METODO CALCOLO AREA
public double calcolaArea() {
	return altezza * larghezza;
}

}
