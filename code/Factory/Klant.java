package code.Factory;

public class Klant {
    private static Color kleur = new Green();
    private static AutoMerk merk = new Audi();
    private static String soort = "Benzine";
    private static String prijsKlasse = "Goedkoop";

    public static int main(){
        int result = 0;
        switch(soort){
            case "Benzine":
                if(prijsKlasse == "Duur"){
                    result = 1;
                    break;
                } else if (prijsKlasse == "Goedkoop") {
                    result = 2;
                    break;
                }
                break;
            case "Elektrisch":
                if(prijsKlasse == "Duur"){
                    result = 3;
                    break;
                }else if(prijsKlasse == "Goedkoop"){
                    result = 4;
                    break;
                }
        }

        return result;
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
