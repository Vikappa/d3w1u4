import ClassiEsercizi.Ecommerce.Articolo;
import ClassiEsercizi.Ecommerce.Carrello;
import ClassiEsercizi.Ecommerce.Cliente;
import ClassiEsercizi.Rettangolo;
import ClassiEsercizi.SimCard;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 1");

        Rettangolo rettangoloEsempio1 = new Rettangolo(12, 15);
        Rettangolo rettangoloEsempio2 = new Rettangolo(8, 20);


        Rettangolo.stampaRettangoli(rettangoloEsempio1, rettangoloEsempio2);

        System.out.println(""); // SPAZIATURA DI CORTESIA PER DISTUNGUERE GLI ESERCIZI
        System.out.println("Esercizio 2");

        SimCard simCardEsempio = new SimCard(348123456);
        simCardEsempio.doCall(347666, 140);
        simCardEsempio.stampaStatus();
        System.out.println(""); // SPAZIATURA DI CORTESIA PER DISTUNGUERE GLI ESERCIZI

        simCardEsempio.doCall(371648, 39);
        simCardEsempio.doCall(371648, 88);
        simCardEsempio.doCall(323889, 100);
        simCardEsempio.doCall(379853, 92);
        simCardEsempio.stampaStatus();
        System.out.println(""); // SPAZIATURA DI CORTESIA PER DISTUNGUERE GLI ESERCIZI
        System.out.println("Faccio la sesta telefonata e controllo che l'elenco scorra");
        simCardEsempio.doCall(347921, 124); //6a telefonata
        simCardEsempio.stampaStatus();

        System.out.println(""); // SPAZIATURA DI CORTESIA PER DISTUNGUERE GLI ESERCIZI
        System.out.println("Esercizio 3");

        Cliente aldBal = new Cliente(1, "Aldo", "Baglio", "conde@dracula.ro","08/03/1900");
        Cliente gioSto = new Cliente(2, "Giovanni", "Storti", "Giovanni@storti.it","12/06/2005");
        Cliente giaPor = new Cliente(3, "Giacomo", "Poretti", "Giacomino@poretticast.it","01/03/2020");
        System.out.println(""); // SPAZIATURA DI CORTESIA PER DISTUNGUERE GLI ESERCIZI

        System.out.println(aldBal.toString());
        System.out.println("");
        System.out.println(gioSto.toString());
        System.out.println("");
        System.out.println(giaPor.toString());
        System.out.println("");

        Articolo cad = new Articolo(1, 10, "Una bella mela", 3);
        Articolo cadr = new Articolo(2, 10, "Una sedia", 2);

        Carrello carrello1 = new Carrello(aldBal);
        Carrello carrello2 = new Carrello(gioSto);
        Carrello carrello3 = new Carrello(giaPor);

        carrello1.pushNelCarrello(cad);

        carrello2.pushNelCarrello(cad);
        carrello2.pushNelCarrello(cadr);
        carrello2.pushNelCarrello(cad);
        carrello2.eliminaDalCarrello(cadr);


        carrello3.pushNelCarrello(cadr);

        System.out.println("Carrelli finali");
        carrello1.stampaCarrello();
        carrello2.stampaCarrello();
        carrello3.stampaCarrello();

    }
}