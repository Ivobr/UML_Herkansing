package code;

import java.util.LinkedList;

public class Klant {
    private Color kleur;
    private AutoMerk merk;
    private int belastingSchaal;
    private String GekozenPartij;
    private int saldo = 60000;
    private int budget = saldo / 4; // budget is klein deel van saldo
    private int extraBudget = saldo  / 6; /// extra budget voor ondeerhandeling
    private LinkedList<Object> autos = new LinkedList<>();

    public Klant(Color kleur, AutoMerk merk, String gekozenPartij, int BelastingSchaal){
        this.kleur = kleur;
        this.merk = merk;
        this.belastingSchaal = BelastingSchaal;
        this.GekozenPartij = gekozenPartij;
    }
    public Color getKleur() {
        return kleur;
    }
    public int getsaldo(){

        return saldo;
    }

    public int getBudget(){
  
        return budget;
    }

    public int vraagHogerBudget(){
        int hogerBudget = budget + extraBudget;
        return hogerBudget;
    }



    public int getBelastingSchaal(){
        return belastingSchaal;
    }

    public AutoMerk getMerk(){
        return merk;
    }

    public String getGekozenPartij() {
        return GekozenPartij;
    }

    public void buyCar(Object obj){
        autos.add(obj);
        System.out.println(autos + "Belastingschaal: " + belastingSchaal);

    }
}
