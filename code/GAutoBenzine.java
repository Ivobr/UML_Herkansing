package code;

public class GAutoBenzine implements BenzineAuto {
    private Color color;
    private AutoMerk merk;
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
        System.out.println(merk.getMerk());
    }

    public GAutoBenzine(Color color, AutoMerk merk){
        this.color = color;
        this.merk = merk;
        ProductiePrijs += color.prijs();
    }
    @Override
    public double getprijs() {
        return ProductiePrijs;
    }
    
}
