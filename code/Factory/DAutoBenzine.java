package code.Factory;

public class DAutoBenzine implements BenzineAuto {

    private Color color;
    private double ProductiePrijs = 21000;
    @Override
    public void vroom() {
        System.out.println("Goes vroom more expensive");
    }

    @Override
    public void informatie(){
        System.out.println(color.colorName());
        System.out.println("€"+ ProductiePrijs);
    }

    public DAutoBenzine(Color color){
        this.color = color;
        ProductiePrijs += color.prijs();
    }
}
