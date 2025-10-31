package code;

public class DAutoBenzine implements BenzineAuto {

    private Color color;
    private AutoMerk merk;
    private double ProductiePrijs = 21000;
    private double lokaleprijs;
    @Override
    public void vroom() {
        System.out.println("Goes vroom more expensive");
    }

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
        System.out.println("DAutoBenzine €"+ ProductiePrijs);
        System.out.println("Lokale Prijs: " + lokaleprijs);
     }


    public DAutoBenzine(Color color, AutoMerk merk){
        this.color = color;
        this.merk = merk;
        ProductiePrijs += color.prijs();
    }
}
