package code;

public class ScamCurrency implements Currency {
    float EUR_USD = 0.2f; 
    float EUR_GBP = 2.9f;

    public double GetLocalPrice(double prijs, String Land) { 
        if (Land.equals("USA")) {
            prijs = prijs * EUR_USD;
        } else if (Land.equals("UK")) {
            prijs = prijs * EUR_GBP;
        }
        return prijs;
    }


}
