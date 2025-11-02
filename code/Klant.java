package code;

import java.util.LinkedList;

public class Klant {
    private Color kleur;
    private AutoMerk merk;
    private int belastingSchaal;
    private String GekozenPartij;
    private String valuta;          // Yen, Euro, Dollar
    private LinkedList<Object> autos = new LinkedList<>();

    // rekening


    public Klant(Color kleur, AutoMerk merk, String gekozenPartij, int BelastingSchaal, String valuta){
        this.kleur = kleur;
        this.merk = merk;
        this.belastingSchaal = BelastingSchaal;
        this.GekozenPartij = gekozenPartij;
        this.valuta = valuta;
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

    public String getValuta(){
        return valuta;
    }


    // Prijs van rekening af (return)
    public void buyCar(Object obj){
        autos.add(obj);
        System.out.println(autos + "Belastingschaal: " + belastingSchaal);

    }

}
