package ClassiEsercizi;

public class SimCard {
    private int nTelefono, creditoCorrente;
    private String[] ultime5Chiamate;


    public SimCard(int numero){
        this.nTelefono = numero;
        this.creditoCorrente = 0;
        this.ultime5Chiamate = new String[5];
        System.out.println("Sim card " + numero + " creata");
    }

    public void stampaStatus() {
        System.out.println( "+39"+this.nTelefono+ " " + ", Credito " + this.creditoCorrente + "€");
        System.out.println("Ultime 5 chiamate:");
        for (int i = 0; i < this.ultime5Chiamate.length; i++) {
            if(this.ultime5Chiamate[i] != null) {
                System.out.println(i + "- " + ultime5Chiamate[i]);
            }
        }

    }

    public void doCall(int nChiamato, int secondiChiamata){
        int minuti = secondiChiamata / 60;
        int secondi = secondiChiamata % 60;

            // Sposta tutto in basso
        for (int i = ultime5Chiamate.length - 1; i > 0; i--) {
            ultime5Chiamate[i] = ultime5Chiamate[i-1];
        }

            ultime5Chiamate[0] = nChiamato + " " + String.format("%02d:%02d", minuti, secondi);
            System.out.println("DRIN DRIN MOTHEFUCKA  " + nChiamato);
    }
}
