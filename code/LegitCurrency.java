package code;

public class LegitCurrency implements Currency {
    float EUR_USD = 1.1f;
    float EUR_GBP = 0.8f;

    public double GetLocalPrice( double prijs, String Land) { 
        if (Land.equals("USA")) {
            prijs = prijs * EUR_USD;
        } else if (Land.equals("UK")) {
            prijs = prijs * EUR_GBP;
        }
        return prijs;
    }


}
