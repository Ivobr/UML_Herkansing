package code.Factory;

import code.Factory.BenzineAuto;

public class GAutoBenzine implements BenzineAuto {
    private Color color;
    private double ProductiePrijs = 12000;
    @Override
    public void vroom() {
        System.out.println("car go vroom");
    }

    @Override
    public void informatie(){
        System.out.println(" ");
        System.out.println(color.colorName());
        System.out.println("GAutoBenzine €"+ ProductiePrijs);
    }

    public GAutoBenzine(Color color){
        this.color = color;
        ProductiePrijs += color.prijs();
    }
}
