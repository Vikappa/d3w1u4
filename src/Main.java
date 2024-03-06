import ClassiEsercizi.Rettangolo;
import ClassiEsercizi.SimCard;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangoloEsempio1 = new Rettangolo(12, 15);
        Rettangolo rettangoloEsempio2 = new Rettangolo(8, 20);


        Rettangolo.stampaRettangoli(rettangoloEsempio1, rettangoloEsempio2);

        System.out.println(""); // SPAZIATURA DI CORTESIA PER DISTUNGUERE GLI ESERCIZI

        SimCard simCardEsempio = new SimCard(348123456);
        simCardEsempio.doCall(347666, 140);
        simCardEsempio.stampaStatus();
        simCardEsempio.doCall(371648, 39);
        simCardEsempio.doCall(371648, 88);
        simCardEsempio.doCall(323889, 100);
        simCardEsempio.doCall(379853, 92);
        simCardEsempio.stampaStatus();
        simCardEsempio.doCall(347921, 124); //6a telefonata
        simCardEsempio.stampaStatus();

        System.out.println(""); // SPAZIATURA DI CORTESIA PER DISTUNGUERE GLI ESERCIZI

    }
}