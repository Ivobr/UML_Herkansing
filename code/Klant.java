package code;

import java.util.LinkedList;

public class Klant {
    private Color kleur;
    private AutoMerk merk;

    private String GekozenPartij;
    private float saldo;
    private float budget; // budget is klein deel van saldo
    private LinkedList<Object> autos = new LinkedList<>();

    public Klant(Color kleur, AutoMerk merk, String gekozenPartij, int saldo){
        this.kleur = kleur;
        this.merk = merk;
        this.saldo = saldo;
        System.out.println(saldo / 4);
        budget = saldo / 4;


        this.GekozenPartij = gekozenPartij;
    }
    public Color getKleur() {
        return kleur;
    }

    public int getsaldo() {

        return saldo;
    }

    public int getBudget(){
  
        return budget;
    }

    public int vraagHogerBudget(){
        int hogerBudget = budget + extraBudget;
        return hogerBudget;
    }


    public AutoMerk getMerk() {
        return merk;
    }

    public String getGekozenPartij() {
        return GekozenPartij;
    }

    public void buyCar(Object obj){
        autos.add(obj);
        System.out.println(autos + "Budget: " + budget);

    }
}
