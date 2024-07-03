package ro.ase.acs.singleton;

import java.util.ArrayList;
import java.util.List;

public class Cuptor extends ACuptor{

    private static Cuptor instance = null;
    List<Comanda> comenzi = new ArrayList<>();
    private Cuptor(){}

    public static synchronized Cuptor getInstance(){
        if(instance == null){
            instance = new Cuptor();
        }
        return instance;
    }

    @Override
    public int getGradeMaxime() {
        return 250;
    }

    @Override
    public int getTimpAsteptare() {
        int timp = 0;
        for(Comanda comanda: comenzi){
            timp = timp + comanda.getTimpGatire();
        }
        return timp;
    }

    @Override
    public void afisareComenziAsteptare() {
            if(comenzi.isEmpty()){
                System.out.println("Nicio comanda");
            }
            else {
                for(Comanda comanda : comenzi){
                    System.out.println(comanda);
                }
            }
    }

    @Override
    public void addComanda(Comanda c) {
        comenzi.add(c);
    }
}
