package code.Bridge.src;

public class DAutoBenzine implements BenzineAuto{
    private Color color;
    private int ProductiePrijs = 15000;
    @Override
    public void vroom() {
        System.out.println("Goes vroom more expensive");
    }

    @Override
    public void informatie(){
        System.out.println("De specificaties van de auto zijn:");
        System.out.println("• Productie prijs: " + ProductiePrijs);
        System.out.println("• Kleur: " + color.colorName());
        System.out.println("    • Prijs: " + color.prijs() * 2);
        ProductiePrijs += color.prijs() * 2;
        System.out.println("Totaal prijs: " + ProductiePrijs);
    }

    public DAutoBenzine(Color color){
        this.color = color;
    }
}
