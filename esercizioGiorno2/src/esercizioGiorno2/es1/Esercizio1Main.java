package esercizioGiorno2.es1;

public class Esercizio1Main {

	public static void main(String[] args) {
	Rettangolo rettangolo1 = new Rettangolo(5.5,10.5);
	Rettangolo rettangolo2 = new Rettangolo(10.5 ,20.5);
	
	//RICHIAMO METODI PER STAMPARE A SCHERMO
	stampaRettangolo(rettangolo1);
	stampaRettangoli(rettangolo1, rettangolo2);
	

	}
	
	//METODO PER STAMPARE PERIMETRO RETTANGOLO E AREA
	public static void stampaRettangolo(Rettangolo rettangolo1) {
		double perimetro = rettangolo1.calcolaPerimetro();
		double area = rettangolo1.calcolaArea();
		
		System.out.println("Il perimetro del rettangolo è: " + perimetro);
		System.out.println("L'area del rettangolo è: " + area);
		
	}
	
	//METODO PER STAMPARE A SCHERMO PERIMETRO E AREA DI DUE RETTANGOLI E LA SOMMA DEI DUE
	
    public static void stampaRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
    	double perimetroRettangolo1 = rettangolo1.calcolaPerimetro();
    	double areaRettangolo1 = rettangolo1.calcolaArea();
    	
    	double perimetroRettangolo2 = rettangolo2.calcolaPerimetro();
    	double areaRettangolo2 = rettangolo2.calcolaArea();
    	
    	double sommaPerimetro = perimetroRettangolo1 + perimetroRettangolo2;
    	double sommaArea = areaRettangolo1 + areaRettangolo1;
    	
    	System.out.println("Il perimetro del rettangolo1 é: " + perimetroRettangolo1 +" "+ "Il perimetro del rettangolo2 è: " + perimetroRettangolo2);
    	System.out.println("L'area del rettangolo1 é: " + areaRettangolo1 + " " + "Il perimetro del rettangolo2 è: " + areaRettangolo2);
    	
    	System.out.println("La somma dei perimetri dei rettangoli è: " + sommaPerimetro);
    	System.out.println("La somma dell' area dei rettangoli è: " + sommaArea);
           
    }

}
