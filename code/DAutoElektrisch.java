package code;

public class DAutoElektrisch implements ElektrischeAuto {

    private Color color;
    private AutoMerk merk;
    private double ProductiePrijs = 120000;

    @Override
    //print info
    public void informatie() {
        System.out.println(" ");
        System.out.println("kleur: " + color.colorName());
        System.out.println("Merk: " + merk.getMerk());
        System.out.println("DAutoBenzine €: " + ProductiePrijs);
        System.out.println("\n ");

    }

    public DAutoElektrisch(Color color, AutoMerk merk) {
        this.color = color;
        this.merk = merk;
        ProductiePrijs += color.prijs();
    }

    @Override
    public int getprijs() {
        return (int) ProductiePrijs;
    }
}
