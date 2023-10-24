package esercitazione;

import java.util.Scanner;

public class Pubblicazione {
    private double prezzoCopertina;
    private int aggio;
    private String nomeCopertina;
    private int copieRicevute;
    private int copieVendute;
    
    
    Scanner input = new Scanner(System.in);

    public void setPrezzoCopertina(double prezzoCopertina) {
        boolean ripeti = true;

        do {

            if (prezzoCopertina > 0) {
                this.prezzoCopertina = prezzoCopertina;
                ripeti = false;

            } else {
                System.out.println("Il prezzo di copertina inserito non è valido");
                System.out.print("Inserire correttamente il prezzo di copertina");
                prezzoCopertina = input.nextDouble();
            }
        } while (ripeti);

    }

    public double getPrezzoCopertina() {
        return prezzoCopertina;
    }

    public void setAggio(int aggio) {
        boolean ripeti = true;

        do {

            if (aggio > 0 && aggio <= 20) {
                this.aggio = aggio;
                ripeti = false;

            } else {
                System.out.println("Percentuale di aggio inserito non valido");
                System.out.print("Inserire correttamente la percentuale di aggio");
                aggio = input.nextInt();
            }
        } while (ripeti);

    }

    public int getAggio() {
        return aggio;
    }

    public void setNomeCopertina(String nomeCopertina) {
        boolean ripeti = true;

        do {

            if (!nomeCopertina.isEmpty()) {
                this.nomeCopertina = nomeCopertina;
                ripeti = false;

            } else {
                System.out.println("Nome di copertina non inserito");
                System.out.print("Inserire correttamente il nome di copertina");
                nomeCopertina = input.nextLine();
            }
        } while (ripeti);

    }

    public String getNomeCopertina() {
        return nomeCopertina;
    }

     public void setCopieRicevute(int copieRicevute) {
        boolean ripeti = true;

        do {

            if (copieRicevute > 0) {
                this.copieRicevute = copieRicevute;
                ripeti = false;

            } else {
                System.out.println("La quantità di copie ricevute inserita non valido");
                System.out.print("Inserire correttamente la quantita'");
                copieRicevute = input.nextInt();
            }
        } while (ripeti);

    }

    public int getCopieRicevute() {
        return copieRicevute;
    }

    public void setCopieVendute(int copieVendute) {
        boolean ripeti = true;

        do {

            if (copieVendute <= getCopieRicevute()) {
                this.copieVendute = copieVendute;
                ripeti = false;

            } else {
                System.out.println("Le quantità vendute inserite non sono valide");
                System.out.print("Inserire correttamente le quantità vendute");
                copieVendute = input.nextInt();
            }
        } while (ripeti);

    }

    public int getCopieVendute() {
        return copieVendute;
    }

   

}
