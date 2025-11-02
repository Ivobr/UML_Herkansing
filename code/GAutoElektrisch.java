package code;


public class GAutoElektrisch implements ElektrischeAuto {

    private Color color;
    private AutoMerk merk;
    private double ProductiePrijs = 23000;

    @Override
    // print informatie auto
    public void informatie() {
        System.out.println(" ");
        System.out.println("kleur: " + color.colorName());
        System.out.println("Merk: " + merk.getMerk());
        System.out.println("Gautoelektrisch €: " + ProductiePrijs);
        System.out.println("\n ");
    }

    public GAutoElektrisch(Color color, AutoMerk merk) {
        this.color = color;
        this.merk = merk;
        ProductiePrijs += color.prijs();
    }

    @Override
    public int getprijs() {
        return (int) ProductiePrijs;
    }
}
