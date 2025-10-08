package code.Factory;

public class Klant {
    private Color kleur;
    private static String soort = "Benzine";
//    private String merk
    private static String prijsKlasse = "Duur";

    public static int main(){
        int result = 0;
        switch(soort){
            case "Benzine":
                if(prijsKlasse == "Goedkoop"){
                    result = 2;
                    break;
                } else if (prijsKlasse == "Duur") {
                    result = 1;
                    break;
                }
                break;
        }

        return result;
    }

    public Color getKleur() {
        return kleur;
    }

}
