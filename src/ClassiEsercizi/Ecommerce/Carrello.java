package ClassiEsercizi.Ecommerce;

public class Carrello {
    private Articolo[] arrayDiArticoliPerCarrello;
    private Cliente clienteAssociato;
    private int costoTotale;

    public Carrello(Cliente clienteAss){
        this.arrayDiArticoliPerCarrello = new Articolo[100];
        this.clienteAssociato = clienteAss;
        this.costoTotale = intResumeCosto();
        System.out.println("Creato carrello di " + clienteAssociato.getNome());
    }

    public int intResumeCosto(){
        int ritorno = 0;

        for (int i = 0; i < this.arrayDiArticoliPerCarrello.length; i++) {
            if (arrayDiArticoliPerCarrello[i] != null) {
                ritorno += arrayDiArticoliPerCarrello[i].getPrezzo();
            }
        }
        return ritorno;
    }

    public void pushNelCarrello(Articolo newObg){
        for (int i = this.arrayDiArticoliPerCarrello.length - 1; i > 0; i--) {
            this.arrayDiArticoliPerCarrello[i] = this.arrayDiArticoliPerCarrello[i-1]; // SPOSTA TUTTO IN BASSO PRIMA DI PUSHARE NELLA NUOVA POSIZIONE
        } // SORRY MAMA FOR MI VIDA ARRAYLIST
        arrayDiArticoliPerCarrello[0] = newObg;
        this.costoTotale = intResumeCosto();
        newObg.setPieces(newObg.getPieces()-1);
        System.out.println("Articolo aggiunto al carrello, pezzi in magazzino -1 rimanenti " + newObg.getPieces());
    }

    public void eliminaDalCarrello(Articolo articoloDaEliminare) {
        for (int i = 0; i < arrayDiArticoliPerCarrello.length; i++) {
if(arrayDiArticoliPerCarrello[i] != null){
    if (arrayDiArticoliPerCarrello[i].equals(articoloDaEliminare)) {
        for (int j = i; j < arrayDiArticoliPerCarrello.length - 1; j++) { // SPINGI IN SU A PARTIRE DAI PROSSIMI
            arrayDiArticoliPerCarrello[j] = arrayDiArticoliPerCarrello[j + 1];
        }
        arrayDiArticoliPerCarrello[arrayDiArticoliPerCarrello.length - 1] = null;
        articoloDaEliminare.setPieces(articoloDaEliminare.getPieces()+1);
        System.out.println("Articolo " + articoloDaEliminare.getCodiceArticolo() +  " tolto dal carrello, pezzi in magazzino +1 , rimanenti " + articoloDaEliminare.getPieces());
    }
}
        }
    }

    public void stampaCarrello(){
        System.out.print("Carrello di " + this.clienteAssociato.getNome() + " " + this.clienteAssociato.getCognome()+", ID:" + this.clienteAssociato.getCodiceCliente()+ ", EMAIL " +this.clienteAssociato.getEmail() + " cliente dal " + this.clienteAssociato.getDataIscrizione());
        for (int i = 0; i < this.arrayDiArticoliPerCarrello.length; i++) {
            if(this.arrayDiArticoliPerCarrello[i] != null) {
                System.out.println(i + "- " + arrayDiArticoliPerCarrello[i]);
            }
        }
        System.out.println("Costo totale: " + this.costoTotale+ "€");
    }

}
