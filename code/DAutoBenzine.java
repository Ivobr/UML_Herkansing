package code;

// dure benzineauto
public class DAutoBenzine implements BenzineAuto {

    private Color color;
    private AutoMerk merk;
    private double ProductiePrijs = 21000;

    @Override
    // print info
    public void informatie() {
        System.out.println(" ");
        System.out.println("kleur" + color.colorName());
        System.out.println("Merk" + merk.getMerk());
        System.out.println("DAutoBenzine €" + ProductiePrijs);
        System.out.println("\n ");
    }

    public DAutoBenzine(Color color, AutoMerk merk) {
        this.color = color;
        this.merk = merk;
        ProductiePrijs += color.prijs();
    }

    @Override
    public int getprijs() {
        return (int) ProductiePrijs;
    }

}
