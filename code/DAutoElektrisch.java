package code;

public class DAutoElektrisch implements ElektrischeAuto {

    private Color color;
    private AutoMerk merk;
    private double ProductiePrijs = 120000;
    private double lokaleprijs;

    @Override
    public void zoom() {
        System.out.println("Goes zoom more expenisive");
    }

    @Override
    public void informatie(){
        System.out.println(" ");
        System.out.println(color.colorName());
        System.out.println(merk.getMerk());
        System.out.println("DAutoElektrisch €" + ProductiePrijs);
        System.out.println("€" + color.prijs());
        System.out.println("Lokale Prijs: " + lokaleprijs);
    }


        public double getProductiePrijs(){
        return ProductiePrijs;
    }

    public void setlokalePrijs(double prijs){
        this.lokaleprijs = prijs;
     
    }


    public DAutoElektrisch(Color color, AutoMerk merk){
        this.color = color;
        this.merk = merk;
        ProductiePrijs += color.prijs();
    }
}
