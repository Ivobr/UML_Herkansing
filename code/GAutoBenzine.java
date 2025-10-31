package code;

public class GAutoBenzine implements BenzineAuto {
    private Color color;
    private AutoMerk merk;
    private double ProductiePrijs = 12000;
    private double lokaleprijs;
    @Override
    public void vroom() {
        System.out.println("car go vroom");
    }

    @Override
       public Color getColor(){
   
        return color;
    }

    public AutoMerk getMerk(){
        return merk;
    }

    public double getProductiePrijs(){
        return ProductiePrijs;
    }

    public void setlokalePrijs(double prijs){
        this.lokaleprijs = prijs;
     
    }
    public void informatie(){
        System.out.println(" ");
        System.out.println(color.colorName());
        System.out.println(merk.getMerk());
        System.out.println("GAutoBenzine €"+ ProductiePrijs);
        System.out.println("Lokale Prijs: " + lokaleprijs);
    }

    public GAutoBenzine(Color color, AutoMerk merk){
        this.color = color;
        this.merk = merk;
        ProductiePrijs += color.prijs();
    }
}
