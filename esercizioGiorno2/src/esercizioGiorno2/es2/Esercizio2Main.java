package esercizioGiorno2.es2;

public class Esercizio2Main {

	public static void main(String[] args) {
		Sim simTelefono = new Sim("333444555");
		simTelefono.ricarica(50);
		simTelefono.chiamateEffettuate[0] = new Chiamata("444557888", 120);
		simTelefono.chiamateEffettuate[1] = new Chiamata("444557456", 200);
		simTelefono.chiamateEffettuate[2] = new Chiamata("444557233", 240);
		simTelefono.chiamateEffettuate[3] = new Chiamata("444557111", 150);
		simTelefono.chiamateEffettuate[4] = new Chiamata("444557999", 130);
        simTelefono.stampaDatiSim();
        
        double creditoResiduo = simTelefono.calcolaCreditoResiduo(120);
        System.out.println("Credito residuo dopo la chiamata: " + creditoResiduo);
	}

}
