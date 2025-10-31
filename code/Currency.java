package code;

public class Currency {
  private Float EUR_USD = 1.1f;
  private Float EUR_GBP = 0.85f;
 



  public double GetLocalPrice( double prijs, String Land) { 
    if (Land.equals("USA")) {
      prijs = prijs * EUR_USD;

    } else if (Land.equals("UK")) {
      prijs = prijs * EUR_GBP;
     
    }
    return prijs;
  }
  
}
