package code.Factory;

public class Klant {
    private static Color kleur;
    private static AutoMerk merk;
    private static String prijsKlasse = "Goedkoop";

    public Klant(Color kleur, AutoMerk merk){
        this.kleur = kleur;
        this.merk = merk;
    }
    public static Color getKleur() {
        return kleur;
    }

    public String getPrijsklasse(){
        return prijsKlasse;
    }

    public AutoMerk getMerk(){
        return merk;
    }
}
