package code;

public class Bank {

  Float EUR_USD = 1.1f;
    Float EUR_GBP = 0.8f;
    public double GetLocalPrice( double prijs, String Land) {
        if (Land.equals("USA")) {
            prijs = prijs * EUR_USD;
        } else if (Land.equals("UK")) {
            prijs = prijs * EUR_GBP;
        }
        
        return prijs;
        }  
    public double wisselvanvaluta(double prijs, String Land) { 
        System.out.println("de dealer vraagt bank om wisselgeld van geld uit"  + Land + "hoeveel?" + ((int)prijs));
        if (Land.equals("USA")) {
            prijs = prijs / EUR_USD;
        } else if (Land.equals("UK")) {
            prijs = prijs / EUR_GBP;
        }
        System.out.println("de dealer krijgt EUR: " + ((int)prijs));
        return prijs;
    }
}
