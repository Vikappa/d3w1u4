package ClassiEsercizi;

public class Rettangolo {
    private int base, altezza, area, perimetro;

    public Rettangolo(int b, int h){
        this.base = b;
        this.altezza = h;
        this.area = (b*h);
        this.perimetro = (base+altezza)*2;
    }

    public static void stampaRettangoli(Rettangolo r1, Rettangolo r2){
        r1.stampaRettangolo();
        r2.stampaRettangolo();
        System.out.println("Somma aree: " + (r1.area+r2.area)+  " Somma perimetri: " + (r1.perimetro+r2.perimetro));
    }

    public void stampaRettangolo(){
        System.out.println("Dati rettangolo: base: " + this.base + ", altezza: " + this.altezza+ ", Area: " + this.area + ", Perimetro " + this.perimetro);

        if(this.base < 30){
            for (int i = 0; i < this.altezza; i++) {
                for (int j = 0; j < this.base; j++) {

                }
            }
        }

    }

}
