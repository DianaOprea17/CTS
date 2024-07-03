package ro.ase.acs.main;

import ro.ase.acs.singleton.Comanda;
import ro.ase.acs.singleton.Cuptor;

public class Main {
    public static void main(String[] args) {

        Comanda comanda1 = new Comanda(30, "Pizza Margherita", 220);
        Comanda comanda2 = new Comanda(20, "Lasagna", 180);
        Comanda comanda3 = new Comanda(45, "Pui la rotisor", 200);
        Comanda comanda4 = new Comanda(25, "Focaccia", 210);

        Cuptor cuptor = Cuptor.getInstance();

        cuptor.addComanda(comanda1);
        cuptor.addComanda(comanda2);
        cuptor.addComanda(comanda3);
        cuptor.addComanda(comanda4);

        cuptor.afisareComenziAsteptare();


    }
}