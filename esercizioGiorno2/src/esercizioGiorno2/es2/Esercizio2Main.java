package esercizioGiorno2.es2;

public class Esercizio2Main {

	public static void main(String[] args) {
		Sim simTelefono = new Sim("333444555");
		simTelefono.ricarica(50);
		simTelefono.chiamateEffettuate[0] = new Chiamata("444557888", 5);
		simTelefono.chiamateEffettuate[1] = new Chiamata("444557456", 6);
		simTelefono.chiamateEffettuate[2] = new Chiamata("444557233", 9);
		simTelefono.chiamateEffettuate[3] = new Chiamata("444557111", 10);
		simTelefono.chiamateEffettuate[4] = new Chiamata("444557999", 20);
        simTelefono.stampaDatiSim();
        
        double creditoResiduo = simTelefono.calcolaCreditoResiduo(50);
        System.out.println("Credito residuo dopo la chiamata: " + creditoResiduo);
	}

}
