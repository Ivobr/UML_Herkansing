package code.Factory;

public class Klant {
    private static Color kleur = new Green();
    private static String soort = "Benzine";
//    private String merk
    private static String prijsKlasse = "Duur";

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
        }

        return result;
    }

    public static Color getKleur() {
        return kleur;
    }

}
