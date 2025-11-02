package code;

import java.util.LinkedList;

public class Klant {
    private Color kleur;
    private AutoMerk merk;

    private String GekozenPartij;
    private float saldo;
    private float budget; // budget is klein deel van saldo
    private LinkedList<Object> autos = new LinkedList<>();

    // Initialiseer klant
    public Klant(Color kleur, AutoMerk merk, String gekozenPartij, float saldo) {
        this.kleur = kleur;
        this.merk = merk;
        this.saldo = saldo;
        System.out.println(saldo / 4);
        budget = saldo / 4;


        this.GekozenPartij = gekozenPartij;
    }

    // Getters, setters
    public Color getKleur() {
        return kleur;
    }

    public int getsaldo() {

        return (int) saldo;
    }

    public float getBudget() {

        return budget;
    }

    // In onderhandelingsfase kan de onderhandelaar vragen voor hoger budget. in dit geval zal er een extra BUDGET vrijgegeven worden
    public int vraagHogerBudget() {
        int hogerBudget = ((int) budget + (int) getsaldo() / 6);
        System.out.println(hogerBudget);
        return hogerBudget;
    }


    public AutoMerk getMerk() {
        return merk;
    }

    public String getGekozenPartij() {
        return GekozenPartij;
    }


    // Voeg auto toe aan eigen lijst van autos
    public void buyCar(Object obj) {
        autos.add(obj);
        System.out.println(autos + "Budget: " + budget);

    }
}
