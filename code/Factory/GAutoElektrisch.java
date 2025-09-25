package code.Factory;

import code.Factory.ElektrischeAuto;

public class GAutoElektrisch implements ElektrischeAuto {

    private Color color;

    private double ProductiePrijs = 23000;

    @Override
    public void zoom() {
        System.out.println("Go zoom");
    }

    @Override
    public void informatie(){
        System.out.println(color.colorName());
        System.out.println("GAutoElektrisch €" + ProductiePrijs);
    }

    public GAutoElektrisch(Color color){
        this.color = color;
        ProductiePrijs += color.prijs();
    }
}
