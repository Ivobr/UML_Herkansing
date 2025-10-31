package code;


public interface Currency {

    Float EUR_USD = 0f; 

    Float EUR_GBP = 0f;
    public double GetLocalPrice(double prijs, String Land);
}