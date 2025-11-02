package code;

public class Bank {


    double toEuro = 0.8;
    public Double ToEuro(double oudePrijs){
        double prijs = oudePrijs * toEuro;
        return prijs;
    }
}
