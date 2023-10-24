package esercitazione;

import java.util.Scanner;
import java.util.ArrayList;

public class Edicola {

    public double guadagnoTotale;
    public double guadagnoSingolo;

    public ArrayList<Pubblicazione> catalogo = new ArrayList<Pubblicazione>();

    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    public void registraCopie() {
        String risposta = "si";
        System.out.println("*** REGISTRAZIONE MERCE ***");

        while (risposta.equals("si") || !risposta.equals("no")) {
            Pubblicazione prodotto = new Pubblicazione();
            System.out.println("Nome copertina: ");

            prodotto.setNomeCopertina(input2.nextLine());
            System.out.println("Quantità: ");

            prodotto.setCopieRicevute(input.nextInt());
            System.out.println("Al prezzo di copertina di: ");

            prodotto.setPrezzoCopertina(input.nextDouble());
            System.out.println("Ho un'aggio di: ");

            prodotto.setAggio(input.nextInt());
            catalogo.add(prodotto);
            System.out.println("Devo registrare altro(si/no)? ");
            risposta = input2.nextLine();
        }

        System.out.println("Tutti i prodotti sono stati registrati con successo!");

    }

    public void riepilogoGiornata() {
        System.out.println("*** MERCE VENDUTA ***");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println(catalogo.get(i).getNomeCopertina() +": " + "  resi: " + (catalogo.get(i).getCopieRicevute() - catalogo.get(i).getCopieVendute()));
           

           
            guadagnoSingolo = ((catalogo.get(i).getPrezzoCopertina() * catalogo.get(i).getAggio()) / 100) * catalogo.get(i).getCopieVendute();

           
            
            guadagnoTotale += guadagnoSingolo;
            }
        System.out.println("Totale guadagnato: " + guadagnoTotale);

    }

}
