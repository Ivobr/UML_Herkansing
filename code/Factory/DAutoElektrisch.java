package code.Factory;

public class DAutoElektrisch implements ElektrischeAuto {

    private Color color;
    private double ProductiePrijs = 120000;

    @Override
    public void zoom() {
        System.out.println("Goes zoom more expenisive");
    }

    @Override
    public void informatie(){
        System.out.println(" ");
        System.out.println(color.colorName());
        System.out.println("DAutoElektrisch €" + ProductiePrijs);
        System.out.println("€" + color.prijs());
    }

    public DAutoElektrisch(Color color){
        this.color = color;
        ProductiePrijs += color.prijs();
    }
}
