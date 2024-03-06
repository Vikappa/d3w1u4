package ClassiEsercizi.Ecommerce;

public class Articolo {
    private int codiceArticolo, prezzo, pieces;
    private String descrizioneArticolo;


    public int getCodiceArticolo() {
        return codiceArticolo;
    }
    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }
    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }
    public  int getPieces() {
        return pieces;
    }

    public  void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public Articolo(int codiceArticolo, int prezzo, String descrizioneArticolo, int magazzino) {
        this.codiceArticolo = codiceArticolo;
        this.prezzo = prezzo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.pieces = magazzino;
    }

public String toString(){
        return this.descrizioneArticolo + " €" + this.prezzo + " ID:" + this.codiceArticolo + " rimanenza:" + this.pieces;
}

}
