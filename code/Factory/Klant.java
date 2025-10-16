package code.Factory;

import java.util.LinkedList;

public class Klant {
    private Color kleur;
    private AutoMerk merk;
    private int belastingSchaal;
    private String GekozenPartij = "Groen links";
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
