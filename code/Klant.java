package code;

import java.util.LinkedList;

public class Klant {
    private Color kleur;
    private AutoMerk merk;
    private int belastingSchaal;
    private String GekozenPartij;
    private String land;
    private Double saldo;
    private LinkedList<Object> autos = new LinkedList<>();

    public Klant(Color kleur, AutoMerk merk, String gekozenPartij, int BelastingSchaal, String land){
        this.kleur = kleur;
        this.merk = merk;
        this.belastingSchaal = BelastingSchaal;
        this.GekozenPartij = gekozenPartij;
        this.land = land;
        this.saldo = 50000.0;
    }
    public String setLand(String land){
        this.land = land;
        return land;
    }
    public String getLand() {
        return land;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void verrekenkosten(Double kosten){
        
        System.out.println("oude saldo: " + saldo);
        this.saldo -= kosten;
        System.out.println("Kosten: " + kosten);
        System.out.println("Nieuwe saldo: " + saldo);

    }
    public Color getKleur() {
        return kleur;
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
