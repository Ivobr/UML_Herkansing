package code;


public class GAutoElektrisch implements ElektrischeAuto {

    private Color color;
    private AutoMerk merk;
    private double ProductiePrijs = 23000;

    @Override
    public void zoom() {
        System.out.println("Go zoom");
    }

    @Override
    public void informatie(){
        System.out.println(" ");
        System.out.println(color.colorName());
        System.out.println(merk.getMerk());
        System.out.println("GAutoElektrisch €" + ProductiePrijs);
    }

    public GAutoElektrisch(Color color, AutoMerk merk){
        this.color = color;
        this.merk = merk;
        ProductiePrijs += color.prijs();
    }
}
